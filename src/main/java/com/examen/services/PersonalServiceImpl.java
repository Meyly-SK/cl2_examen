package com.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.models.Personal;
import com.examen.repositories.PersonalDao;

@Service
public class PersonalServiceImpl implements PersonalService{
	
	@Autowired
	private PersonalDao personalRepository;
	
	@Override
	public List<Personal> getAllPersonal(){
		return this.personalRepository.findAll();
	}
	
	@Override
	public List<Personal> getPersonalByAreaCodigo(long codigo) {
	    return personalRepository.findByAreaCodigo(codigo);
	}
}
