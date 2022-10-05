package com.practica.fabian.repository;

import com.practica.fabian.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository  extends JpaRepository<Producto,Long> {

    List<Producto> findAllByNombre(String nombre);
    List<Producto> findAllByCategoria(String categoria);

}
