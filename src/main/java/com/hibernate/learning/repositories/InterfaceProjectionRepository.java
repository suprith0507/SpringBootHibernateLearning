package com.hibernate.learning.repositories;

import com.hibernate.learning.controllers.ProductController;
import com.hibernate.learning.entities.InterfaceProjectionProductEntity;
import com.hibernate.learning.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterfaceProjectionRepository extends JpaRepository<ProductEntity,Long> {
                                                                //observe it is prodcutentity not the interfaceentity
    List<InterfaceProjectionProductEntity> findByName(String name);
    //Query Optional here as JPA can generate the query for us based on the name.
    //Query can also be provided if we want custom query. It can be JPQL or SQL
    //Projection is interface based so spring JPA knows how to map object[] returned from query output to InterfaceProjectionProductEntity
    //understand that projection and query are two different things.
    //query says what to fetch . it can be provided or it can be infered by JPA from the methodname.
    //Query can be JPQL or SQL as usual .
    //projection says how to map. For interface Projection,it automatically converts object[] to InterfaceDTO
    //Query becomes mandatory for Constructor based projection as JPA will not be able to map the object[] received from DB to DTO automatically
    //Query has to be only JPQL with new keyword only for constructor based Projection.
}
