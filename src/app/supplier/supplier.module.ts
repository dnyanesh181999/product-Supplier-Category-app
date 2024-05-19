import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SupplierRoutingModule } from './supplier-routing.module';
import { AddSupplierComponent } from './add-supplier/add-supplier.component';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AddSupplierComponent,
    
  ],
  imports: [
    CommonModule,
    SupplierRoutingModule,
    ReactiveFormsModule
  ]
})
export class SupplierModule { }
