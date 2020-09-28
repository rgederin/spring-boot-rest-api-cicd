package com.gederin.api.mapper;

import com.gederin.api.dto.CarBrandDto;
import com.gederin.api.model.CarBrand;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarBrandMapper {

    CarBrandDto mapToCarBrandDto(CarBrand carBrand);

    CarBrand mapToCarBrand(CarBrandDto carBrandDto);
}