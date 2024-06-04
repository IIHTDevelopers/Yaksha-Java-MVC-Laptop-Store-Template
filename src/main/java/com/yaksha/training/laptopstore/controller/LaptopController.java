package com.yaksha.training.laptopstore.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.laptopstore.entity.Laptop;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/laptop", "/" })
public class LaptopController {

	@GetMapping(value = { "/list", "/" })
	public String listLaptops(@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/addLaptopForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveLaptop")
	public String saveLaptop(@Valid @ModelAttribute("laptop") Laptop laptop, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateLaptopForm")
	public String showFormForUpdate(@RequestParam("laptopId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteLaptop(@RequestParam("laptopId") Long id) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchLaptops(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateBestSeller")
	public String updateBestSeller(@RequestParam("id") Long id) {
		// write your logic here
		return "";
	}
}
