package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.CategoryEntity;
import com.ecom.service.CategoryService;

@RestController
@RequestMapping("/Category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/all")
	public List<CategoryEntity> getAllCategory() {
		return categoryService.getAllCategory();
	}
	
	@PostMapping("/add")
	public CategoryEntity addCategory(@ModelAttribute CategoryEntity categoryEntity)
	{
		return categoryService.addCategory(categoryEntity);
	}
}
