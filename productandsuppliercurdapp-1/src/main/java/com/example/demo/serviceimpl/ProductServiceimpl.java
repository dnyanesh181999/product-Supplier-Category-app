package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.homrepository.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.servicei.ProductServicei;

@Service
public class ProductServiceimpl implements ProductServicei{
	@Autowired
	ProductRepository pr;
	


	@Override
	public Product saveProduct(Product product) {
		Product p=pr.save(product);
		return p;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product>list=(List<Product>) pr.findAll();
		return list;
	}

	@Override
	public Product getProductId(Integer productId) {
		Product prod=pr.findById(productId).get();
		return prod;
	}

	@Override
	public void deleteProduct(Integer productId) {
		pr.deleteById(productId);
		
	}

	@Override
	public Product updateProduct(Product prod) {
		Product product=pr.save(prod);
		return product;
	}

}
