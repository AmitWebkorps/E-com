package com.ecom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entity.CategoryEntity;


@Repository
public interface CategoryRepo extends CrudRepository<CategoryEntity, Integer> {

	
}
