package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.AadharCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AadharCardEntityRepository extends JpaRepository<AadharCardEntity, Long> {
}