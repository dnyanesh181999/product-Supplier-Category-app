import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Supplier } from '../model/supplier';
import { Product } from '../model/product';
import { Category } from '../model/category';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  saveSupplier(supplier:Supplier){
   return this.http.post('http://localhost:9090/supplier/supplier',supplier);
  }
  getAllSupplier(){
    return this.http.get('http://localhost:9090/supplier/suppliers');
  }
  saveProduct(product:Product){
    console.log(product)
    return this.http.post("http://localhost:9090/product/product",product);
  }
  getAllProduct(){
    return this.http.get("http://localhost:9090/product/products")
  }
  getSingleProduct(productId:number){
    return this.http.get(`http://localhost:9090/product/product/${productId}`)
  }
  updateProduct(prod:Product){
    return this.http.put(`http://localhost:9090/product/product/${prod.productId}`,prod)
  }

  saveCategory(category:Category){
    return this.http.post('http://localhost:9090/category/category',category)
  }

  getAllCategory(){
    return this.http.get('http://localhost:9090/category/categorys')
  }

  


}
