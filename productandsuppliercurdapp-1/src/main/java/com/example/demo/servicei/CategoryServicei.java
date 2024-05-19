package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryServicei {

	public Category saveCategory(Category category);

	public List<Category> getAllCategory();

	public Category getSingleCategory(Integer categoryId);

	

}
