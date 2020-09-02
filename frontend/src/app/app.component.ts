import { Component } from '@angular/core';
import { ProductoserviceService } from './service/productoservice.service';
import { Producto } from './service/Producto';

//Formilarios
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  productos : Producto[];
  myFormProducto : FormGroup;

    constructor( public servc:ProductoserviceService){}

    ngOnInit(){
      this.obtenerProductos()

      this.myFormProducto = new FormGroup({
        nombre: new FormControl(''),
        precio: new FormControl(''),
        descripcion: new FormControl('')
      });
    }

    obtenerProductos(){
    this.servc.getProductos().subscribe(respuesta=>{
      console.log(respuesta);
      return this.productos = respuesta;
    });

  }

  ingresarDatos(){
    let nombre = this.myFormProducto.value.nombre;
    let precio = this.myFormProducto.value.precio;
    let descripcion = this.myFormProducto.value.descripcion;

    this.servc.addProductos(nombre,precio,descripcion)
    .subscribe(r=>{
      this.obtenerProductos()
      this.myFormProducto = new FormGroup({
        nombre: new FormControl(''),
        precio: new FormControl(''),
        descripcion: new FormControl('')
      });
    })
  }

  editarDatos(){
    let nombre = this.myFormProducto.value.nombre;
    let precio = this.myFormProducto.value.precio;
    let descripcion = this.myFormProducto.value.descripcion;


    this.servc.editProductos(nombre,precio,descripcion)
    .subscribe(r=>{
      this.obtenerProductos()
      this.myFormProducto = new FormGroup({
        nombre: new FormControl(nombre),
        precio: new FormControl(precio),
        descripcion: new FormControl(descripcion)
      });
    })
  }


}
