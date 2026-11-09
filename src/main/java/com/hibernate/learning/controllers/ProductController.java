package com.hibernate.learning.controllers;


import com.hibernate.learning.entities.WatchEntity;
import com.hibernate.learning.repositories.WatchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<WatchEntity> getWatchesList()
    {
       //return watchRepository.getAllByBrandOrderByBrandDesc("Rolex");
        return watchRepository.getAllByBrandOrderByPriceDesc("Rolex");

    }
}
