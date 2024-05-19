package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Supplier;

public interface SupplierServicei {

   public Supplier saveSupplier(Supplier p);

   public List<Supplier> getAllSupplier();

public void deleteSupplier(Integer supplierId);

public Supplier getSingleSupplier(Integer supplierId);

public Supplier updateSupplier(Supplier s);

}
