package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Supplier;
import com.example.demo.servicei.SupplierServicei;

@RestController
@CrossOrigin("*")
@RequestMapping("supplier")
public class SupplierController {
@Autowired
SupplierServicei ss;
@PostMapping("/supplier")
public Supplier saveSupplier(@RequestBody Supplier p) {
	Supplier s=ss.saveSupplier(p);
	return s;
}
@GetMapping("/suppliers")
public List<Supplier>getAllSupplier(){
	List<Supplier>list = ss.getAllSupplier();
	return list;
}
@DeleteMapping("/supplier/{supplierId}")
public String deleteSupplier(@PathVariable Integer supplierId) {
	ss.deleteSupplier(supplierId);
	return "Supplier data deleted sucessfully";
}
@GetMapping("/supplier/{supplierId}")
public Supplier getSingleSupplier(@PathVariable Integer supplierId) {
	Supplier s=ss.getSingleSupplier(supplierId);
	return s;
}
@PutMapping("/supplier/{supplierId}")
public Supplier updateSupplier(@RequestBody Supplier s,@PathVariable Integer supplierId) {
	Supplier supplier = ss.updateSupplier(s);
	return supplier;
}


}
