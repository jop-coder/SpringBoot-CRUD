package com.app.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.modelo.Articulo;
import com.app.repositorio.ArticulosRepo;


@Service
public class ArticuloService
{
	@Autowired
	private ArticulosRepo repo;
	
	public List<Articulo> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Articulo product)
	{
		repo.save(product);
	}
	
	public Articulo get(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
