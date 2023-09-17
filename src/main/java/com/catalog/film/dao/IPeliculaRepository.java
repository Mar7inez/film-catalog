package com.catalog.film.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalog.film.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {
	
}
