package com.hibernate.learning.entities;

import jakarta.persistence.*;

@Entity
@Table
public class AadharCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long aadharId;
    private String aadharNumber;
    private String address;
    private String city;
    private String state;

    @OneToOne(mappedBy = "aadharCardEntity" ,fetch = FetchType.EAGER,orphanRemoval = true,cascade = CascadeType.ALL)
    //this tell spring that aadhar is not the oowner entity
    //look for a variable called aadharCardEntity in Patient entity. that fellow will hold the Fkey.
    //fetchtype will be eager for onetoone and manytoone by default as they point to one parent and it can be fetched faster
    //fetchtype will be lazy for onetomany and manytomany by default as they point to multiple rows and hence not enabled by default to fetch those related records
    //cascade means to apply the operations on child when the operation is performed on its parent
    //cascade can be MERGE /PERSIST/REMOVE/REFRESH/DETACH/ALL
    //orphanremoval removes the unreferenced child.This is disabled by default.
    //child can be delinked from parent by setting the childID to null or a newchildID in the parent table
    private PatientEntity patientEntity;
    //Aadhar doenst have any Fkey about patient. so this is the inverse side.




}
