package com.hibernate.learning.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

    @ManyToMany(cascade = CascadeType.ALL)//only cascade and fetch are available.orphan removal not available for many to many
    @JoinTable(name="doctor_department",
            joinColumns = {@JoinColumn(name="doctor_id")},
            inverseJoinColumns = {@JoinColumn(name="department_id")}
    )//one join table is mandatory for manytomanyrelationship.Otherwise it will not know about who is the owner in the relationship
    private List<DepartmentEntity> departmentEntitiesFromDoctor=new ArrayList<>();

    //each doctor can work in multiple departments
    //decide who is owner. logically Doctor is owner.ur wish it can be department also.
}
