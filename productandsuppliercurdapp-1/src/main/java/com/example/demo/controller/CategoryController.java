package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.servicei.CategoryServicei;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryServicei cs;
	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category) {
		Category c=cs.saveCategory(category);
		return c;
	}
	@GetMapping("/categorys")
	public List<Category>getAllCategory(){
		List<Category> list = cs.getAllCategory();
		return list;
	}
	@GetMapping("/category/{categoryId}")
	public Category getSingleCategory(@PathVariable Integer categoryId) {
		Category c = cs.getSingleCategory(categoryId);
		return c;
	}
	
}
