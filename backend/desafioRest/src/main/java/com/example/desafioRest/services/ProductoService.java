package com.example.desafioRest.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafioRest.models.Producto;
import com.example.desafioRest.repositories.ProductoRepository;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepository productoRepo;
	
	
	@Override
	public Producto create(Producto p) {
		
		return productoRepo.save(p);
	}

	@Override
	public Producto update(Producto p) {
	
		return productoRepo.save(p);
	}

	@Override
	public Producto findById(Integer id) {
		Optional<Producto> productoOpcional = productoRepo.findById(id);
		return productoOpcional.orElse(null);
	}

	@Override
	public List<Producto> findall() {
		
		return productoRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		productoRepo.deleteById(id);
	}
	
	

}
