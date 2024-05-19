import { Category } from "./category";
import { Supplier } from "./supplier";

export class Product {

    productId:number;
	productName:string;
	
	 productPrice:number;
	 supplier:Supplier;
	 category:Category;
}
