package com.yaksha.training.laptopstore.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.laptopstore.entity.Laptop;

@Controller
@RequestMapping(value = { "/laptop", "/" })
public class LaptopController {

	@GetMapping(value = { "/list", "/" })
	public String listLaptops(Model model) {
		return "";
	}

	@GetMapping("/addLaptopForm")
	public String showFormForAdd(Model model) {
		return "";
	}

	@PostMapping("/saveLaptop")
	public String saveLaptop(@Valid @ModelAttribute("laptop") Laptop laptop, BindingResult bindingResult) {
		return "";
	}

	@GetMapping("/updateLaptopForm")
	public String showFormForUpdate(@RequestParam("laptopId") Long id, Model model) {
		return "";
	}

	@GetMapping("/delete")
	public String deleteLaptop(@RequestParam("laptopId") Long id) {
		return "";
	}

	@PostMapping("/search")
	public String searchLaptops(@RequestParam("theSearchName") String theSearchName, Model theModel) {
		return "";
	}
}
