package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorEntityRepository extends JpaRepository<DoctorEntity, Long> {
}