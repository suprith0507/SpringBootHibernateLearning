package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.AadharCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadharCardEntityRepository extends JpaRepository<AadharCardEntity, Long> {
}