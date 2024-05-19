import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../services/service.service';
import { Product } from '../../model/product';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-product',
  templateUrl: './view-product.component.html',
  styleUrl: './view-product.component.css'
})
export class ViewProductComponent implements OnInit {
  prod:Product[];
constructor(private ss:ServiceService,private router:Router){}
  ngOnInit(): void {
    this.ss.getAllProduct().subscribe((resp:Product[])=>{
      this.prod = resp;
    })
  }
  onEdit(id:number){
    this.router.navigateByUrl(`/product/edit/${id}`)

  }
}
