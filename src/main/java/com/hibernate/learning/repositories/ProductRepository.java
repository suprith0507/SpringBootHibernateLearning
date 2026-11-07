package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    public List<ProductEntity> findDistictByNameLike( String s);
}
