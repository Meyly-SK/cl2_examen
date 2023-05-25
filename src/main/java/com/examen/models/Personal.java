package com.examen.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Personal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personal_id")
	int id;
	
	@Column(name = "personal_nombre")
	String nombre;
	
	@Column(name = "personal_sueldo")
	double sueldo;
	
	@ManyToOne
	@JoinColumn(name="personal_area_id")
	Area area;
}
