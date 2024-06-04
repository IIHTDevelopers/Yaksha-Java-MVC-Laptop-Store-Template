package com.yaksha.training.laptopstore.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.laptopstore.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

	// feel free to update this
	Page<Laptop> findAllLaptop(Pageable pageable);

	// feel free to update this
	Page<Laptop> findByNameOrBrandOrProcessor(@Param("keyword") String keyword, Pageable pageable);

	// feel free to update this
	void updateBestSeller(@Param("id") Long id);

}
