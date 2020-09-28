package com.gederin.api.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarBrandDto {
    private String name;
    private String country;
    private String description;

    private String uri;

    private Set<CarModelDto> carModels;
}