package com.hibernate.learning;

import com.hibernate.learning.entities.ProductEntity;
import com.hibernate.learning.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class LearningApplicationTests {

	@Autowired
	ProductRepository productRepository;
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

}
