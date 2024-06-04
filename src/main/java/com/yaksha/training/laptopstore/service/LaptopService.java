package com.yaksha.training.laptopstore.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.laptopstore.entity.Laptop;

@Service
public class LaptopService {

	public Page<Laptop> getLaptops(Pageable pageable) {
		// write your logic here
		return null;
	}

	public Laptop saveLaptop(Laptop laptop) {
		// write your logic here
		return null;
	}

	public Laptop getLaptop(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteLaptop(Long id) {
		// write your logic here
		return false;
	}

	public Page<Laptop> searchLaptops(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean updateBestSeller(Long id) {
		// write your logic here
		return false;
	}

}
