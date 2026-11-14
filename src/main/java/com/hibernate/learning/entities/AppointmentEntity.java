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

    @ManyToOne()
    @JoinColumn(name="patient_id")
    private PatientEntity patientEntityFromAppointment;
    //no need to put cascadetype here because we dont have any child for appointment.we dont have to save patient first and save appointment
    //assuming appointment will be made only for a valid patient. so no need of cascade here.
    //no need to put orphan removal here as this is not the parent of any other child
    //we dont have a case which needs delete appoitmentparams when they are not linked to any appoinment
    //if we have such case we can put orphanremoval as true.
    //ORPHAN REMOVAL IS NOT AVAILABLE ALSO FOR ManyToOne and ManyToMany
}
