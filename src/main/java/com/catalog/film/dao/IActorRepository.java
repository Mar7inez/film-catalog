package com.catalog.film.dao;

import org.springframework.data.repository.CrudRepository;

import com.catalog.film.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor, Long> {

}
