package com.hibernate.learning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String location;
    private String blockName;
    private String departmentCode;

    @ManyToMany(mappedBy = "departmentEntitiesFromDoctor")
    // This mappedBy is required is to tell srping dont create one more join table. Join table creation is handled already in DoctorEntity
    private List<DoctorEntity> doctorEntities= new ArrayList<>();

    //each department can contain multiple departments
    //decide who is owner. logically Doctor is owner.ur wish it can be department also.
}
