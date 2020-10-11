package com.gederin.api;

import com.gederin.api.dto.CarBrandDto;
import com.gederin.api.dto.CarModelDto;
import com.gederin.api.model.CarBrand;
import com.gederin.api.model.CarModel;

import java.util.Arrays;
import java.util.List;

public class TestHelper {

    public static final String NAME = "Audi";
    public static final String COUNTRY = "Germany";
    public static final String DESCRIPTION = "description";

    public static CarBrand buildCarBrandTestObject() {
        CarBrand carBrand = new CarBrand();

        carBrand.setName(NAME);
        carBrand.setCountry(COUNTRY);
        carBrand.setDescription(DESCRIPTION);

        return carBrand;
    }

    public static List<CarBrand> buildCarBrandListTestObject() {
        return Arrays.asList(buildCarBrandTestObject(), buildCarBrandTestObject());
    }

    public static List<CarBrandDto> buildCarBrandListDtoTestObject() {
        return Arrays.asList(buildCarBrandDtoTestObject(),buildCarBrandDtoTestObject());
    }

    public static CarBrandDto buildCarBrandDtoTestObject() {
        CarBrandDto carBrandDto = new CarBrandDto();

        carBrandDto.setName(NAME);
        carBrandDto.setCountry(COUNTRY);
        carBrandDto.setDescription(DESCRIPTION);

        return carBrandDto;
    }

    public static CarModelDto buildCarModelDtoTestObject (){
        CarModelDto carModelDto = new CarModelDto();

        carModelDto.setName(NAME);
        carModelDto.setType(COUNTRY);

        return carModelDto;
    }

    public static CarModel buildCarModelTestObject (){
        CarModel carModel = new CarModel();

        carModel.setName(NAME);
        carModel.setType(COUNTRY);

        return carModel;
    }

    public static List<CarModel> buildCarModelListTestObject() {
        return Arrays.asList(buildCarModelTestObject(), buildCarModelTestObject());
    }

    public static List<CarModelDto> buildCarModelListDtoTestObject() {
        return Arrays.asList(buildCarModelDtoTestObject(),buildCarModelDtoTestObject());
    }
}
