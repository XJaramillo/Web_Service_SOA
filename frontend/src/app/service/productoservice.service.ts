import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Producto } from './Producto';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductoserviceService {

  URL="http://localhost:8080/productos";
  constructor(private httpc:HttpClient) { }

    //Get
  getProductos(): Observable<Producto[]>{
    return this.httpc.get<Producto[]>(this.URL);
  }

  //POST
  addProductos(nombre:string, precio:string, descripcion:string){
    let obj = {nombre,precio,descripcion}
    return this.httpc.post(this.URL, obj);
  }

  //PUT
  editProductos(nombre:string, precio:string, descripcion:string){
    let obj = {nombre,precio,descripcion}
    return this.httpc.put(this.URL, obj);
  }

  //Delete
  deleteProductos(id: string | number){
    return this.httpc.delete(`${this.URL}/id=${id}`);
  }


}
