package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.CategoryEntity;
import com.ecom.repository.CategoryRepo;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	public List<CategoryEntity> getAllCategory() {
		return (List<CategoryEntity>) this.categoryRepo.findAll();
	}
	
	public CategoryEntity addCategory(CategoryEntity categoryEntity){
		  return this.categoryRepo.save(categoryEntity);
	}
}
