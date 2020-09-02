package com.example.desafioRest.models;

import javax.persistence.*;

@Entity
@Table(name="producto") 
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Column(name="nombre", nullable=false, length=20)
	private String nombre;
	
	@Column(name="precio", nullable=false, length=20)
	private String precio;
	
	@Column(name="descripcion", nullable=false, length=50)
	private String descripcion;
	
	
	
	/*Gtters y Stters*/
	public Integer getIdCliente() {
		return idProducto;
	}

	public void setIdCliente(Integer idCliente) {
		this.idProducto = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
		
}


