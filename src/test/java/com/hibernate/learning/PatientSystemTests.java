package com.hibernate.learning;


import com.hibernate.learning.entities.PatientEntity;
import com.hibernate.learning.repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PatientSystemTests {

    @Autowired
    PatientRepository patientRepository;

    @Test
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


    }
}
