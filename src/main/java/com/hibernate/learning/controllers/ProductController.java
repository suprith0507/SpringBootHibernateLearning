package com.hibernate.learning.controllers;


import com.hibernate.learning.entities.WatchEntity;
import com.hibernate.learning.repositories.WatchRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/productsAPI")
public class ProductController {


    private final WatchRepository watchRepository;
    public ProductController(WatchRepository watchRepo) {
        this.watchRepository=watchRepo;
    }


    @GetMapping(path="/getWatchesList")
    public List<WatchEntity> getWatchesList(@RequestParam(defaultValue = "brand") String sortBy)
    {
       //return watchRepository.getAllByBrandOrderByBrandDesc("Rolex");
        //return watchRepository.getAllByBrandOrderByPriceDesc("Rolex");

       //return watchRepository.getAllBy(Sort.by(sortBy)); //method1  equal to direction asc
       //return watchRepository.getAllBy(Sort.by(Sort.Direction.ASC,sortBy)) ;//mentioning sort direction to asc manually. no mention also same ouput
        //return watchRepository.getAllBy(Sort.by(Sort.Direction.DESC,sortBy));
        //return watchRepository.getAllBy(Sort.by(Sort.Direction.DESC,sortBy,"model","collection"));
        //sort all of them in desc order and sort by multiple fields

        return watchRepository.getAllBy(Sort.by(Sort.Order.asc(sortBy) ,Sort.Order.desc("model") ));
        //sort multiple fields each one in its own asc/desc fashion
    }
}
