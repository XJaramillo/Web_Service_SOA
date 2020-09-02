package com.example.desafioRest.services;

import java.util.List;

import com.example.desafioRest.models.Producto;

public interface IProductoService {
	
	Producto create (Producto p);
	Producto update (Producto p);
	Producto findById (Integer id);
	List<Producto> findall ();
	
	void delete(Integer id);

}
