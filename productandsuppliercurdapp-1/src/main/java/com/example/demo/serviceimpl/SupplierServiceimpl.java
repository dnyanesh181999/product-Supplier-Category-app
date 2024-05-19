package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.homrepository.SupplierRepository;
import com.example.demo.model.Supplier;
import com.example.demo.servicei.SupplierServicei;
@Service
public class SupplierServiceimpl implements SupplierServicei{
@Autowired
SupplierRepository sr;

@Override
public Supplier saveSupplier(Supplier p) {
	Supplier supplier=sr.save(p);
	return supplier;
}

@Override
public List<Supplier> getAllSupplier() {
	List<Supplier>li=(List<Supplier>) sr.findAll();
	return li;
}

@Override
public void deleteSupplier(Integer supplierId) {
	sr.deleteById(supplierId);
	
}

@Override
public Supplier getSingleSupplier(Integer supplierId) {
	Supplier s=sr.findById(supplierId).get();
	return s;
}

@Override
public Supplier updateSupplier(Supplier s) {
	Supplier supplier = sr.save(s); 
	return supplier;
}
}
