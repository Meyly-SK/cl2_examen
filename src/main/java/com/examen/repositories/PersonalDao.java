package com.examen.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examen.models.Personal;

@Repository
public interface PersonalDao extends CrudRepository<Personal, Long> {
	
	public List<Personal> findAll();
	
}
