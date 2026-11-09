package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.WatchEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WatchRepository extends JpaRepository<WatchEntity,Long> {

    public List<WatchEntity> getAllByBrandOrderByBrandDesc(String brand);

    public List<WatchEntity> getAllByBrandOrderByPriceDesc(String brand);

    public List<WatchEntity> getAllBy(Sort sort);
}
