package com.gederin.api.service;

import com.gederin.api.dto.CarBrandDto;
import com.gederin.api.mapper.CarBrandMapper;
import com.gederin.api.mapper.CarModelMapper;
import com.gederin.api.repository.CarBrandRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static com.gederin.api.TestHelper.COUNTRY;
import static com.gederin.api.TestHelper.DESCRIPTION;
import static com.gederin.api.TestHelper.NAME;
import static com.gederin.api.TestHelper.buildCarBrandDtoTestObject;
import static com.gederin.api.TestHelper.buildCarBrandListTestObject;
import static com.gederin.api.TestHelper.buildCarBrandTestObject;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarBrandServiceTest {

    private final CarBrandMapper carBrandMapper = Mappers.getMapper(CarBrandMapper.class);

    private final CarModelMapper carModelMapper = Mappers.getMapper(CarModelMapper.class);

    @Mock
    private CarBrandRepository carBrandRepository;

    private CarBrandService carBrandService;

    @BeforeEach
    void setUp() {
        carBrandService = new CarBrandService(carBrandRepository, carBrandMapper);
    }

    @Test
    void shouldReturnListOfCarBrandsDto() {
        when(carBrandRepository.findAll()).thenReturn(buildCarBrandListTestObject());

        assertThat(carBrandService.getAllCarBrands(), notNullValue());
        assertThat(carBrandService.getAllCarBrands().size(), is(2));
    }

    @Test
    void shouldReturnCarBrandDtoById() {
        when(carBrandRepository.findById(1L)).thenReturn(Optional.of(buildCarBrandTestObject()));

        CarBrandDto carBrandDto = carBrandService.getCarBrandById(1L);

        assertCarBrandDto(carBrandDto);
    }

    @Test
    public void shouldAddNewCarBrand (){
        when(carBrandRepository.save(any())).thenReturn(buildCarBrandTestObject());

        assertCarBrandDto(carBrandService.createCarBrand(buildCarBrandDtoTestObject()));
    }

    @Test
    void shouldDeleteCarBrandById() {
        carBrandRepository.deleteById(1L);

        verify(carBrandRepository, times(1)).deleteById(1L);
    }

    private void assertCarBrandDto(CarBrandDto carBrandDto) {
        assertThat(carBrandDto, notNullValue());
        assertThat(carBrandDto.getName(), is(NAME));
        assertThat(carBrandDto.getCountry(), is(COUNTRY));
        assertThat(carBrandDto.getDescription(), is(DESCRIPTION));
    }
}