package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppointmentEntityRepository extends JpaRepository<AppointmentEntity, Long> {
}