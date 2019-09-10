package com.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.modelo.Articulo;

public interface ArticulosRepo extends JpaRepository<Articulo, Integer>
{

}
