package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.ConstructorDToProjectionEntity;
import com.hibernate.learning.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConstructorDTOProjectionRepository  extends JpaRepository<ProductEntity,Long> {


    @Query("select new com.hibernate.learning.entities.ConstructorDToProjectionEntity(p.name ,p.price) from ProductEntity p where p.name=?1")
     public List<ConstructorDToProjectionEntity> findByName( String name);

    //Query becomes mandatory for Constructor based projection as JPA will not be able to map the object[] received from DB to DTO automatically
    //Query becomes mandatory because JPA will not be able to map the DB output object[] to DTO directly as it will get confused with which constructor to invoke here as it is a class and not interface
    //Interface projection we use interface so JPA knows there are only 2 methods inside it and can map the data to DTO
    //Constructor DTO projection, JPA will not be able to map the object[] as it doesnt know which constructr to call
    //JPA doesnt use reflection concept. so it can't scan runtime
    //So we need to unambigiously define which constructor to call using the new keyword in Query
    //Query has to be only JPQL with new keyword only for constructor based Projection.
    //
    //If you want to avoid Query and you want spring only to handle it, you need to create a record instead of class
    //Record will have only one constructor unlike class and hence JPA can invoke that and create the DTO

}
