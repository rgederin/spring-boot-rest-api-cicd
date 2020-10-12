package com.gederin.api.mapper;

import com.gederin.api.dto.CarBrandDto;
import com.gederin.api.model.CarBrand;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.gederin.api.TestHelper.COUNTRY;
import static com.gederin.api.TestHelper.DESCRIPTION;
import static com.gederin.api.TestHelper.NAME;
import static com.gederin.api.TestHelper.buildCarBrandDtoTestObject;
import static com.gederin.api.TestHelper.buildCarBrandTestObject;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class CarBrandMapperTest {


    @Autowired
    private CarBrandMapper carBrandMapper;

    @Test
    void shouldMapToDto() {
        CarBrandDto carBrandDto = carBrandMapper.mapToCarBrandDto(buildCarBrandTestObject());

        assertThat(carBrandDto, notNullValue());
        assertThat(carBrandDto.getName(), is(NAME));
        assertThat(carBrandDto.getCountry(), is(COUNTRY));
        assertThat(carBrandDto.getDescription(), is(DESCRIPTION));
    }

    @Test
    void shouldMapToModel() {
        CarBrand carBrand = carBrandMapper.mapToCarBrand(buildCarBrandDtoTestObject());

        assertThat(carBrand, notNullValue());
        assertThat(carBrand.getName(), is(NAME));
        assertThat(carBrand.getCountry(), is(COUNTRY));
        assertThat(carBrand.getDescription(), is(DESCRIPTION));
    }
}
