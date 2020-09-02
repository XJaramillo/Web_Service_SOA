package com.example.desafioRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafioRest.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
