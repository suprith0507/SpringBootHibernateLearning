package com.hibernate.learning.entities;

import jakarta.persistence.*;

@Entity
@Table
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long doctorId;
    private String doctorName;
    private String specialization;
    private Double experience;
    private String mobileNumber;
}
