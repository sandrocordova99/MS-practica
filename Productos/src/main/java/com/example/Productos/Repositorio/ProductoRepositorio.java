package com.example.Productos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Productos.Modelos.Productos;

@Repository
public interface ProductoRepositorio extends JpaRepository<Productos,Long>{
    
}
