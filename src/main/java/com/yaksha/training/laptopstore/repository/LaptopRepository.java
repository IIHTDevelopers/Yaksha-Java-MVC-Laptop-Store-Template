package com.yaksha.training.laptopstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.laptopstore.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

	List<Laptop> findByLaptopNameAndBrand(@Param("keyword") String keyword);
}
