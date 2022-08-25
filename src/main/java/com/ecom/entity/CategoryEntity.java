package com.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Category")
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	String categoryName;
	String categoryImage; 
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	@Override
	public String toString() {
		return "CategoryEntity [categoryName=" + categoryName + ", categoryImage=" + categoryImage + "]";
	}
}
