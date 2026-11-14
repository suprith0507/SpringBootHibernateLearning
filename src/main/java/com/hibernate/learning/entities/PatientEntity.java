package com.hibernate.learning.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long patientId;
    private String patientName;
    private Integer age;
    private String gender;
    private String mobileNumber;

    @OneToOne()
    @JoinColumn(name="aadhar_id")
    // In DB patient table it will look for a key called aadhar_id and use it as Fkey for join operations.
    //this joincolumn doesnt mention about relationship. relatioship is defined by onetoone annoation
    //Join column defines the Fkey to be used from the DB for creating join queries.
    private AadharCardEntity aadharCardEntityfromPatient;
    //patient has aadhar. patient table will have AADharID s Fkey. so this one is the owning side
    //owing side should have the Joincolumn annotation .Inverse side should have the mapped by annoation.

    @OneToMany(mappedBy = "patientEntityFromAppointment",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<AppointmentEntity> appointmentEntities=new ArrayList<>();
    //usually patient_id will be there in appointments table.
    //we cant have appoitmentIDs in one column in patients table.
    //so appointments table holding Fkey==>owner ,Patient==>inverse side
    //put cascadetype here because if we want to save patient , we need to first save appointment.
    //put orphanremoval here because this is the parent and we want appointment to be removed if patient is removed.
}
