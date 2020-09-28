package com.gederin.api.controller;

import com.gederin.api.dto.CarBrandDto;
import com.gederin.api.service.CarBrandService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
public class CarBrandController {

    private final CarBrandService carBrandService;

    @GetMapping("info")
    public String info (){
        return "Cars rest api";
    }

    @GetMapping("brands")
    @ResponseStatus(HttpStatus.OK)
    public List<CarBrandDto> carBrands() {
        return carBrandService.getAllCarBrands();
    }

    @GetMapping("brand/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CarBrandDto carBrand(@PathVariable long id) {
        return carBrandService.getCarBrandById(id);
    }

    @PostMapping ("brand")
    @ResponseStatus(HttpStatus.CREATED)
    public CarBrandDto createCarBrand (@RequestBody CarBrandDto carBrandDto){
        return carBrandService.createCarBrand(carBrandDto);
    }

    @DeleteMapping("brand/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCarBrand(@PathVariable long id) {
        carBrandService.deleteCarBrandById(id);
    }
}
