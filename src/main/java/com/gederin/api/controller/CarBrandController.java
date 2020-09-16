package com.gederin.api.controller;

import com.gederin.api.model.CarBrand;
import com.gederin.api.repository.CarBrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class CarBrandController {

    @Autowired
    private CarBrandRepository carBrandRepository;

    @GetMapping ("/")
    public List<CarBrand> carBrands(){
        return carBrandRepository.findAll();
    }
}
