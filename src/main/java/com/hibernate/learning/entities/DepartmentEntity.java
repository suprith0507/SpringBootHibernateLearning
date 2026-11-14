package com.hibernate.learning.entities;

import jakarta.persistence.*;

@Entity
@Table
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String location;
    private String blockName;
    private String departmentCode;
}
