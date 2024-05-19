package com.example.demo.homrepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Integer>{

}
