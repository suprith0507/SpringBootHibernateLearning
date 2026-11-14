package com.hibernate.learning.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long appointmentId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String status;
    private Double consultationFee;
}
