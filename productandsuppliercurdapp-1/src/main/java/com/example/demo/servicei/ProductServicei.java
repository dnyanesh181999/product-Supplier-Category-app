package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductServicei {

	public Product saveProduct(Product product);

	public List<Product> getAllProduct();

	public Product getProductId(Integer productId);

	public void deleteProduct(Integer productId);

	public Product updateProduct(Product prod);

}
