package com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Curso {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String tutor;

	public Curso(String nombre, String tutor) {
		super();
		this.nombre = nombre;
		this.tutor = tutor;
	}
    

//---ONE TO MANY---------------------------------------------------------------------------------------------------
	
	@OneToMany(mappedBy="curso", fetch = FetchType.EAGER) //LO QUE SE PONE DENTRO DEL MAPPED BY ES EL ATRIBUTO DE LA CLASE DE ENFRENTE CON MANY TO ONE
	@Builder.Default //LUISMI EXPLICA BUILDER
	private List<Alumno> alumnos = new ArrayList<>();
	

}