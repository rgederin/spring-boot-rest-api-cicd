package com.gederin.api.mapper;

import com.gederin.api.dto.CarModelDto;
import com.gederin.api.model.CarModel;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarModelMapper {

    CarModelDto mapToCarModelDto(CarModel carModel);

    CarModel mapToCarModel(CarModelDto carModelDto);
}