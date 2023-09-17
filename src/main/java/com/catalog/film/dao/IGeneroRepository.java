package com.catalog.film.dao;

import org.springframework.data.repository.CrudRepository;

import com.catalog.film.entities.Genero;

public interface IGeneroRepository extends CrudRepository<Genero, Long> {
	
	
}
