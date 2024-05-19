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

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.model.Supplier;
import com.example.demo.servicei.CategoryServicei;
import com.example.demo.servicei.ProductServicei;
import com.example.demo.servicei.SupplierServicei;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {
@Autowired
ProductServicei hs;
@Autowired
SupplierServicei ss;
@Autowired
CategoryServicei cs;

@PostMapping("/product")
public Product saveProduct(@RequestBody Product product) {
	Integer id=product.getSupplier().getSupplierId();
	Supplier s=ss.getSingleSupplier(id);
		
	Integer cid=product.getCategory().getCategoryId();
	Category c=cs.getSingleCategory(cid);
	
	product.setCategory(c);
	product.setSupplier(s);
	
	return hs.saveProduct(product);

}


@GetMapping("/products")
public List<Product>getAllProduct(){
	List<Product>list = hs.getAllProduct();
	return list;
}
@GetMapping("/product/{productId}")
public Product getProductById(@PathVariable Integer productId) {
	Product prod=hs.getProductId(productId);
	return prod;
}
@DeleteMapping("/product/{productId}")
public String deleteProduct(@PathVariable Integer productId) {
	hs.deleteProduct(productId);
	return "Product delte sucessfully";
}
@PutMapping("/product/{productId}")
public Product updateProduct(@RequestBody Product prod,@PathVariable Integer productId) {
	
	Integer id=prod.getSupplier().getSupplierId();
	Supplier s=ss.getSingleSupplier(id);
	prod.setSupplier(s);
	Integer cid=prod.getCategory().getCategoryId();
	Category c=cs.getSingleCategory(cid);
	
	prod.setCategory(c);
	Product p=hs.updateProduct(prod);
	return p;
}


}
