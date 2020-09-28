package com.gederin.api.service;

import com.gederin.api.dto.CarBrandDto;
import com.gederin.api.mapper.CarBrandMapper;
import com.gederin.api.model.CarBrand;
import com.gederin.api.repository.CarBrandRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarBrandService {
    private final CarBrandRepository carBrandRepository;

    private final CarBrandMapper carBrandMapper;

    public List<CarBrandDto> getAllCarBrands() {
        return carBrandRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public CarBrandDto getCarBrandById(long id) {
        return carBrandRepository.findById(id)
                .map(this::mapToDto)
                .orElseThrow(RuntimeException::new);
    }

    public CarBrandDto createCarBrand(CarBrandDto carBrandDto) {
        CarBrand carBrand = carBrandMapper.mapToCarBrand(carBrandDto);

        return Optional.of(carBrandRepository.save(carBrand))
                .map(this::mapToDto)
                .orElseThrow(RuntimeException::new);
    }

    public void deleteCarBrandById(Long id) {
        carBrandRepository.deleteById(id);
    }

    private CarBrandDto mapToDto(CarBrand carBrand) {
        CarBrandDto carBrandDto = carBrandMapper.mapToCarBrandDto(carBrand);
        carBrandDto.setUri("api/v1/brand/" + carBrand.getId());

        return carBrandDto;
    }
}
