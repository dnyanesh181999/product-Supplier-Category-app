package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.homrepository.CategoryRepository;
import com.example.demo.model.Category;
import com.example.demo.servicei.CategoryServicei;

@Service
public class CategoryServiceimpl implements CategoryServicei{

	@Autowired
	CategoryRepository cr;

	@Override
	public Category saveCategory(Category category) {
		Category c=cr.save(category);
		return c;
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category>list=(List<Category>) cr.findAll();
		return list;
	}

	@Override
	public Category getSingleCategory(Integer categoryId) {
		Category c=cr.findById(categoryId).get();
		return c;
	}


}
