package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentEntityRepository extends JpaRepository<DepartmentEntity, Long> {
}