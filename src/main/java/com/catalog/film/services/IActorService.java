package com.catalog.film.services;

import java.util.List;

import com.catalog.film.entities.Actor;

public interface IActorService {
	public List<Actor> findAll();
	public List<Actor> findAllById(List<Long> ids);
}
