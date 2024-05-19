import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ServiceService } from '../../services/service.service';

@Component({
  selector: 'app-add-supplier',
  templateUrl: './add-supplier.component.html',
  styleUrl: './add-supplier.component.css'
})
export class AddSupplierComponent implements OnInit{

  frm:FormGroup
  constructor(private fb:FormBuilder,private ser:ServiceService){}
ngOnInit(): void {
  this.frm = this.fb.group({
    
   supplierId:[],
	 supplierName:[],
   
	 supplierEmail:[],
	 supplierContact:[],
	 supplierAddress:[]
  })

 
}

onSubmit(){
  alert("Conform")
  this.ser.saveSupplier(this.frm.value).subscribe()
}
}
