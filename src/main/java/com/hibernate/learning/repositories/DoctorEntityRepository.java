package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorEntityRepository extends JpaRepository<DoctorEntity, Long> {
}