package com.hibernate.learning.controllers;


import com.hibernate.learning.entities.WatchEntity;
import com.hibernate.learning.repositories.WatchRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    private final int PAGE_SIZE =3 ;
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

        //return watchRepository.getAllBy(Sort.by(Sort.Order.asc(sortBy) ,Sort.Order.desc("model") ));
        //sort multiple fields each one in its own asc/desc fashion

        return watchRepository.getAllBy(Sort.by(sortBy).ascending()); // one more way of using sort.



    }

    @GetMapping(path="/getPaginatedWatchesList")

    public Page<WatchEntity> getPaginatedWatchesList(@RequestParam(defaultValue = "1") Integer pagenumber,
                                                     @RequestParam(defaultValue = "id") String sortBy){

        Pageable pageable = PageRequest.of(pagenumber,PAGE_SIZE);

        return watchRepository.getAllBy(pageable);



    }

    @GetMapping(path="/getPaginatedWatchesListContentOnly")

    public List<WatchEntity> getPaginatedWatchesListContentOnly(@RequestParam(defaultValue = "1") Integer pagenumber,
                                                     @RequestParam(defaultValue = "id") String sortBy){

        Pageable pageable = PageRequest.of(pagenumber,PAGE_SIZE);
        Pageable pageable1 = PageRequest.of(pagenumber,PAGE_SIZE,Sort.by(sortBy).ascending());
        Pageable pageable2 =PageRequest.of(pagenumber,PAGE_SIZE,Sort.by(Sort.Direction.ASC,sortBy));
        Pageable pageable3 =PageRequest.of(pagenumber,PAGE_SIZE,Sort.by(Sort.Order.asc(sortBy)));

        //return watchRepository.getAllBy(pageable).getContent();
        //return watchRepository.getAllBy(pageable1).getContent();
        //return watchRepository.getAllBy(pageable2).getContent();
        return watchRepository.getAllBy(pageable3).getContent();
        //return watchRepository.getAllBy(pageable).getTotalPages(); you can return all the page metadata
        //page number starts from 0



    }

    @GetMapping(path="/getPaginatedWatchesListContaining")

    public List<WatchEntity> getPaginatedWatchesListContainingCaliber(@RequestParam(defaultValue = "1") Integer pagenumber,
                                                                    @RequestParam(defaultValue = "id") String sortBy,
                                                                    @RequestParam(defaultValue = "s") String caliber)
    {

        Pageable pageable = PageRequest.of(pagenumber,PAGE_SIZE);
        Pageable pageable1 = PageRequest.of(pagenumber,PAGE_SIZE,Sort.by(sortBy).ascending());
        Pageable pageable2 =PageRequest.of(pagenumber,PAGE_SIZE,Sort.by(Sort.Direction.ASC,sortBy));
        Pageable pageable3 =PageRequest.of(pagenumber,PAGE_SIZE,Sort.by(Sort.Order.asc(sortBy)));

        //return watchRepository.getAllBy(pageable).getContent();
        //return watchRepository.getAllBy(pageable1).getContent();
        //return watchRepository.getAllBy(pageable2).getContent();
        return watchRepository.getAllByCaliberContaining(caliber,pageable3);
        //return watchRepository.getAllBy(pageable).getTotalPages(); you can return all the page metadata
        //page number starts from 0



    }


}
