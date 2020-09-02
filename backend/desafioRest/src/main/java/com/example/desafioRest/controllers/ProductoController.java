package com.example.desafioRest.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.desafioRest.models.Producto;
import com.example.desafioRest.repositories.ProductoRepository;
import com.example.desafioRest.services.ProductoService;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/productos")
public class ProductoController {
	

	@Autowired
	private ProductoService productoservice;
	
	@GetMapping
	public List<Producto> findall() {
		return productoservice.findall();
	}
	
	@PostMapping
	public Producto create(@RequestBody Producto p) {
		return productoservice.create(p);
	}

	
	@GetMapping("/{id}")
	public Producto findById (@PathVariable("id") Integer id) {
		return productoservice.findById(id);
	}

	@PutMapping("/{id}")
	public Producto findById (@RequestBody Producto p, @PathVariable("id") Integer id) {
		return productoservice.update(p);
	}
	
	@DeleteMapping("/{IdProducto}")
	public void delete (@PathVariable("IdProducto") Integer IdCliente) {
		productoservice.delete(IdCliente); 
	}
	
	
}
