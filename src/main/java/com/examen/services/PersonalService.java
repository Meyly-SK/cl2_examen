package com.examen.services;

import java.util.List;

import com.examen.models.Personal;

public interface PersonalService {
	public List<Personal> getAllPersonal();
	
	List<Personal> getPersonalByAreaCodigo(long codigo);
}
