package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentEntityRepository extends JpaRepository<DepartmentEntity, Long> {
}