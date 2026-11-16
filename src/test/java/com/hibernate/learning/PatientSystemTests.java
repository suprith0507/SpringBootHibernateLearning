package com.hibernate.learning;


import com.hibernate.learning.entities.AadharCardEntity;
import com.hibernate.learning.entities.PatientEntity;
import com.hibernate.learning.repositories.PatientRepository;
import com.hibernate.learning.services.EntityServiceUtility;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PatientSystemTests {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    EntityServiceUtility entityServiceUtility;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    //without this you will never be able to see managed state as Hibernate creates its own transaction and closes PC once save is executed
    public void savePatient(){

        PatientEntity patientEntity= PatientEntity.builder().
               // patientId().
                patientName("John").
                age(20).
                gender("Male").
                mobileNumber("1234567890").
                //aadharCardEntityfromPatient().
                //appointmentEntities().
                build();

        AadharCardEntity aadharCardEntity =AadharCardEntity.builder().
                //aadharId().
                aadharNumber("123456789").
                address("abcstreet").
                city("bellampally").
                state("telangana").
                //patientEntity().
                build();



        entityServiceUtility.printState("Patient before setting aadhar card",patientEntity);//transient
        entityServiceUtility.printState("aadharCard when created",aadharCardEntity); //transient

        patientEntity.setAadharCardEntityfromPatient(aadharCardEntity);

        entityServiceUtility.printState("Patient after setting aadhar card",patientEntity);//transient
        entityServiceUtility.printState("aadharCard",aadharCardEntity);//transient

        patientRepository.save(patientEntity);
        entityServiceUtility.printState("Patient after invoking save",patientEntity);//managed
        entityServiceUtility.printState("aadharCard after invoking save on only patient",aadharCardEntity);//managed

        patientEntity.setAadharCardEntityfromPatient(null);

        entityServiceUtility.printState("Patient after invoking delink aadhar",patientEntity);// still managed
        entityServiceUtility.printState("aadharCard after invoking delink aadhar from patient",aadharCardEntity);// still managed

        entityManager.flush();
        entityServiceUtility.printState("Patient after invoking  flush post delink aadhar",patientEntity);// still managed
        entityServiceUtility.printState("aadharCard after invoking flush post delink aadhar from patient",aadharCardEntity);//detached


        AadharCardEntity aadharCardEntitynew =AadharCardEntity.builder().
                //aadharId().
                        aadharNumber("123456789").address("abcstreet").city("bellampally").state("telangana").
                //patientEntity().
                        build();
        entityServiceUtility.printState("Patient before invoking link new aadhar",patientEntity);// still managed
        entityServiceUtility.printState("aadharCardEntityold before invoking link new aadhar to patient",aadharCardEntity); //detached
        entityServiceUtility.printState("aadharCardEntitynew before invoking link new aadhar to patient",aadharCardEntitynew);//transient

        patientEntity.setAadharCardEntityfromPatient(aadharCardEntitynew);
        entityServiceUtility.printState("Patient after invoking link new aadhar",patientEntity);// still managed
        entityServiceUtility.printState("aadharCardEntityold after invoking link new aadhar to patient",aadharCardEntity);//detached
        entityServiceUtility.printState("aadharCardEntitynew after invoking link new aadhar to patient",aadharCardEntitynew);//transient

        entityManager.flush();
        //if we dont write this still it will flush towards the end of transaction
        // (which is end of this method and you cant see any sql on console as method would have exited)

        entityServiceUtility.printState("Patient after invoking flush post link new aadhar",patientEntity);// still managed
        entityServiceUtility.printState("aadharCardEntityold after invoking flush post link new aadhar to patient",aadharCardEntity);//detached
        entityServiceUtility.printState("aadharCardEntitynew after invoking flush post link new aadhar to patient",aadharCardEntitynew);//managed

        PatientEntity PatientEntity1 =
                patientRepository
                        .findById(1L)
                        .get(); //lazy loading wont work for one to one mapping .it fetches child also as it is only one row

        PatientEntity1.getAadharCardEntityfromPatient().getAadharId();


        entityManager.detach(patientEntity);

        entityServiceUtility.printState("Patient after invoking detach patient",patientEntity);// detached
        entityServiceUtility.printState("aadharCardEntityold after detach patient",aadharCardEntity);//detached
        entityServiceUtility.printState("aadharCardEntitynew after invoking detach patient",aadharCardEntitynew);//detached

        AadharCardEntity aadharCardEntitynew2 =AadharCardEntity.builder().
                //aadharId().
                        aadharNumber("123456789").address("abcstreet").city("bellampally").state("telangana").
                //patientEntity().
                        build();

        patientEntity.setAadharCardEntityfromPatient(aadharCardEntitynew2);
        entityManager.flush();
        //no dirty checking happens on detached entities even with explicit flush

        entityServiceUtility.printState("Patient after invoking flush post link new aadhar",patientEntity);// detached
        entityServiceUtility.printState("aadharCardEntityold after invoking flush post link new aadhar to detached patient ",aadharCardEntity);//detached
        entityServiceUtility.printState("aadharCardEntitynew after invoking flush post link new aadhar to detached patient",aadharCardEntitynew);//detached
        entityServiceUtility.printState("aadharCardEntitynew2 after invoking flush post link new aadhar to detached patient",aadharCardEntitynew2);//detached

        PatientEntity merged =
                entityManager.merge(patientEntity);

        entityServiceUtility.printState("Patient after invoking merge",patientEntity);// detached
        entityServiceUtility.printState("Patient after invoking merge",merged);//managed
        entityServiceUtility.printState("aadharCardEntityold after invoking merge",aadharCardEntity);//detached
        entityServiceUtility.printState("aadharCardEntitynew after invoking merge",aadharCardEntitynew);//detached
        entityServiceUtility.printState("aadharCardEntitynew2 after invokingmerge",aadharCardEntitynew2);//transient
        // aadharCardEntitynew2 still transient as it didnt get added on a detached patient. so dirty checking and db update didnt happen.

       // entityManager.remove(patientEntity);DetachedObjectException: Given entity is not associated with the persistence context
        entityManager.remove(merged); //no SQL generated. just the entity marked as deleted in persistence context

       // entityServiceUtility.printState("Patient after invoking remove",patientEntity);// cant invoke remove on a detached entity
        entityServiceUtility.printState("Patient after invoking remove",merged);//removed
       // entityServiceUtility.printState("aadharCardEntityold after invoking remove",aadharCardEntity);//cant invoke remove on a detached entity
       // entityServiceUtility.printState("aadharCardEntitynew after invoking remove",aadharCardEntitynew);//ant invoke remove on a detached entity
        entityServiceUtility.printState("aadharCardEntitynew2 after remove",aadharCardEntitynew2);//transient

       entityManager.flush();//sql generated and row deleted.
        //if we dont write this still it will flush towards the end of transaction
        // (which is end of this method and you cant see any sql on console as method would have exited)
        entityServiceUtility.printState("Patient after invoking remove",merged);//removed
        entityServiceUtility.printState("aadharCardEntitynew2 after remove",aadharCardEntitynew2);//transient

    }
}
