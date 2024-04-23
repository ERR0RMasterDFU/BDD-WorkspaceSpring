package com.salesianostriana.dam.ejemplo1_datajpa.modelo;

import jakarta.persistence.Entity; //Detecta la clase como una entidad.
import jakarta.persistence.GeneratedValue; //El valor es generado por la BDD.
import jakarta.persistence.Id; //Clave primaria.

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Entity
public class Alumno {
	
	@Id @GeneratedValue
	private long id;
	
	private String nombre, apellidos, email;
	
	public Alumno(String n, String a, String e) { //CONSTRUCTOR VACÍO PARA EVITAR PONER EL ID (AUTOGENERADO).
		this.nombre = n;
		this.apellidos = a;
		this.email = e;
	}

}
