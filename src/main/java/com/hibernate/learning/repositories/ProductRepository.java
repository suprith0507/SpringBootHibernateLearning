package com.hibernate.learning.repositories;

import com.hibernate.learning.entities.ProductEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    public List<ProductEntity> findDistictByNameLike( String s);


    @Query("select e from ProductEntity e where e.name=?1")
    public List<ProductEntity> getAllProductsByNameSanotoor( String name);
    //default is JPQL and only works with Entity class variable names. Doesn't work with backend DB table names


    @Query(value = "select * from product_table e where e.product_name=?1",nativeQuery = true)
    public List<ProductEntity> getAllProductsByNameSanotoorSQL( String name);
    //nativeQuery =true makes it work with SQL and  now we can only use backend DB table names not the entity class variable names

    @Query(name="getProductListbyIdJPQL")
    public List<ProductEntity> getAllProductsByNameSantoorNamedQueryJPQL( String name);

    @Query(name="getProductListbyIdSQL")
    public List<ProductEntity> getAllProductsByNameSantoorNamedQuerySQL( String name);

    @Query(value = "CALL getProductInfo(?1)",nativeQuery = true)
    public List<ProductEntity> ProductsByNameSanotoorSQLProc( Integer Id);

    @Modifying
    @Transactional
    @Query(value = "CALL updateProductprice(?1,?2)",nativeQuery = true)
    public List<ProductEntity> updatePriceUsingSQLProc(  Double price, Integer Id);
    //works without @modifying and @transactional if we commit in the procside.

    @Modifying
    @Transactional
    @Query(value = "update product_table e set e.product_price=?1 where e.id=?2",nativeQuery = true)
    public void updateProductpriceInlineUpdate( Double price, Integer Id);

    //@Transactional
    @Procedure("getProductInfo")
    public List<ProductEntity> ProductsByNameSanotoorSQLProcAnnoation( Integer Id);

    @Procedure(name="storedProcPreDefinedQueryforGetbyName")
    public String ProductsByNameSanotoorSQLProcNamedAnnoation( Integer Id);



}
