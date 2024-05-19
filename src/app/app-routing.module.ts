import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'supplier',loadChildren:()=>import('./supplier/supplier.module').then(m=>m.SupplierModule)},
  {path:"product",loadChildren:()=>import('./product/product.module').then(m=>m.ProductModule)},
  {path:'category',loadChildren:()=>import('./category/category.module').then(m=>m.CategoryModule)}

  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
