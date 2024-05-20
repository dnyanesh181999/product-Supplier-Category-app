import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ServiceService } from '../../services/service.service';
import { Supplier } from '../../model/supplier';
import { ActivatedRoute } from '@angular/router';
import { Product } from '../../model/product';
import { Category } from '../../model/category';


@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrl: './add-product.component.css'
})
export class AddProductComponent implements OnInit{
frm:FormGroup;
supplier:Supplier[]
category:Category[]
flag:boolean;


  constructor(private fb:FormBuilder,private ss:ServiceService,private activatedRoute:ActivatedRoute){}
ngOnInit(): void {
  this.frm = this.fb.group({
    productId:[],
    productName:[],
     productPrice:[],
     supplier:this.fb.group({
      supplierId:[]
     }),
     category:this.fb.group({
      categoryId:[]
     })
  })
  this.getProductToBeEdit();

this.ss.getAllSupplier().subscribe((res:Supplier[])=>{
  this.supplier=res
})
this.ss.getAllCategory().subscribe((resp:Category[])=>{
  this.category=resp;
})

}

onSubmit(){
if(!this.flag){
 alert("Are you sure to sumit data")
  this.ss.saveProduct(this.frm.value).subscribe();
}
else{
  alert("Are you sure to sumbit data")
  this.ss.updateProduct(this.frm.value).subscribe();
}
this.frm.reset();

}
getProductToBeEdit(){
  let id:number=0;
  this.activatedRoute.paramMap.subscribe(map=>{
    id=parseInt(map.get('id'))
  })
  if(id!=0 && id!=null){
    this.ss.getSingleProduct(id).subscribe((res:Product)=>{
      this.frm.patchValue(res);
      this.flag=true;
    })
  }
}
count:number=1;
next(){
  this.count++;
}
previous(){
  this.count--;
}
preview(){

  this.count=5;
  
}

}
