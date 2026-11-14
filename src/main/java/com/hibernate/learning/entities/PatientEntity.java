package com.hibernate.learning.entities;

import jakarta.persistence.*;

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
    private AadharCardEntity aadharCardEntity;
    //patient has aadhar. patient table will have AADharID s Fkey. so this one is the owning side
    //owing side should have the Joincolumn annotation .Inverse side should have the mapped by annoation.
}
