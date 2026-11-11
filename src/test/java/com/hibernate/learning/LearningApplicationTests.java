package com.hibernate.learning;

import com.hibernate.learning.entities.ConstructorDToProjectionEntity;
import com.hibernate.learning.entities.InterfaceProjectionProductEntity;
import com.hibernate.learning.entities.ProductEntity;
import com.hibernate.learning.repositories.ConstructorDTOProjectionRepository;
import com.hibernate.learning.repositories.InterfaceProjectionRepository;
import com.hibernate.learning.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class LearningApplicationTests {

	@Autowired
	ProductRepository productRepository;
	@Autowired
	InterfaceProjectionRepository interfaceProjectionRepository;

	@Autowired
	ConstructorDTOProjectionRepository constructorDTOProjectionRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void saveProduct(){

		ProductEntity productEntity =ProductEntity.builder()
				//.Id(1L)
				.name("Santoor")
		         .price(Double.valueOf(234.5)).
				createdDate(LocalDateTime.now()).
				updatedDate(LocalDateTime.now()).build();

		productRepository.save(productEntity);

	}

	@Test
	void findDistictByNameLike()
	{
		List<ProductEntity> productEntityList=productRepository.findDistictByNameLike("Sant%");
		System.out.println(productEntityList);

	}

	@Test
	void getAllProductsByNameSanotoor()
	{
		List<ProductEntity> productEntityList=productRepository.getAllProductsByNameSanotoor("Santoor");
		System.out.println(productEntityList);

	}
	@Test
	void getAllProductsByNameSanotoorSQL()
	{
		List<ProductEntity> productEntityList=productRepository.getAllProductsByNameSanotoorSQL("Santoor");
		System.out.println(productEntityList);

	}

	@Test
	void getAllProductsByNameSantoorNamedQueryJPQL()
	{
		List<ProductEntity> productEntityList=productRepository.getAllProductsByNameSantoorNamedQueryJPQL("Santoor");
		System.out.println(productEntityList);
		System.out.println("getAllProductsByNameSantoorNamedQueryJPQL");

	}

	@Test
	void getAllProductsByNameSantoorNamedQuerySQL()
	{
		List<ProductEntity> productEntityList=productRepository.getAllProductsByNameSantoorNamedQuerySQL("Santoor");
		System.out.println(productEntityList);
		System.out.println("getAllProductsByNameSantoorNamedQuerySQL");

	}

	@Test
	void getAllProductsByNameSanotoorSQLProc()
	{
		List<ProductEntity> productEntityList=productRepository.ProductsByNameSanotoorSQLProc(Integer.valueOf(1));
		System.out.println("getAllProductsByNameSanotoorSQLProc");
		System.out.println(productEntityList);

	}

	@Test
	@Transactional
	void getAllProductsByNameSanotoorNamedSQLProc()
	{
		String productName=productRepository.ProductsByNameSanotoorSQLProcNamedAnnoation(Integer.valueOf(1));
		System.out.println("getAllProductsByNameSanotoorNamedSQLProc");
		System.out.println(productName);

	}

	@Test
	void updatePriceUsingSQLProc()
	{
		List<ProductEntity> productEntityList=productRepository.updatePriceUsingSQLProc(Double.valueOf(100.32) ,Integer.valueOf(1));
		System.out.println("getAllProductsByNameSanotoorSQLProc");
		System.out.println(productEntityList);

	}

	@Test
	void updateProductpriceInlineUpdate()
	{
		productRepository.updateProductpriceInlineUpdate(Double.valueOf(50.32) ,Integer.valueOf(1));
		System.out.println("updateProductpriceInlineUpdate");
		//System.out.println(productEntityList);

	}

	@Test
	@Transactional
	void ProductsByNameSanotoorSQLProcAnnoation()
	{
		List<ProductEntity> productEntityList=productRepository.ProductsByNameSanotoorSQLProcAnnoation(Integer.valueOf(1));
		System.out.println("updateProductpriceInlineUpdate");
		System.out.println(productEntityList);

	}

	@Test
	void findByNameInterfaceProjectionExample()
	{
		List<InterfaceProjectionProductEntity> interfaceProjectionProductEntities = interfaceProjectionRepository.findByName("Monitor");
		System.out.println("interfaceProjectionProductEntities");
		System.out.println(interfaceProjectionProductEntities);
	}

	@Test
	void findByNameConstructorDTOProjectionExample()
	{
		List<ConstructorDToProjectionEntity> constructorDToProjectionEntities = constructorDTOProjectionRepository.findByName("Monitor");
		System.out.println("findByNameConstructorDTOProjectionExample");
		System.out.println(constructorDToProjectionEntities);
	}



}
