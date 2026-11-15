package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientInterface  extends JpaRepository<PatientEntity,Long> {
}
