package com.catalog.film.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.catalog.film.entities.Pelicula;

public interface IPeliculaService {

	public void save(Pelicula pelicula);

	public Pelicula findById(Long id);
	
	public List<Pelicula> findAll();

	public Page<Pelicula> findAll(Pageable pagable);
	
	public void delete(Long id);
}
