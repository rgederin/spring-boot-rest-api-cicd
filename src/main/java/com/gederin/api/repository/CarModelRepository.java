package com.gederin.api.repository;

import com.gederin.api.model.CarModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long> {
    List<CarModel> findByCarBrandId(Long id);

    List<CarModel> findByCarBrandName(String carBrandName);
}