import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ServiceService } from '../../services/service.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrl: './add-category.component.css'
})
export class AddCategoryComponent implements OnInit{
frm:FormGroup;
  constructor(private fb:FormBuilder,private ps:ServiceService){

}

  ngOnInit(): void {
    this.frm = this.fb.group({
     categoryId:[],
	 categoryType:[]
    })
  }
  onSubmit(){
    alert("Are you sure to save Category")
    this.ps.saveCategory(this.frm.value).subscribe();
  }
}
