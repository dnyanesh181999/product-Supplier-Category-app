package com.example.demo.homrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
