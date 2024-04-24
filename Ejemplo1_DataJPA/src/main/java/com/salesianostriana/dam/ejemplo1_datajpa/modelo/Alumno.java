package com.salesianostriana.dam.ejemplo1_datajpa.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column; //PODER MODIFICAR COLUMNAS
import jakarta.persistence.Entity; //Detecta la clase como una entidad.
import jakarta.persistence.GeneratedValue; //El valor es generado por la BDD.
import jakarta.persistence.Id; //Clave primaria.
import jakarta.persistence.Table; //HACER TABLA Y PODER CAMBIAR SU NOMBRE
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor 
@Entity @Table(name="alumnado") 
public class Alumno {
	
	@Id @GeneratedValue
	private long id;
	
	@Column(updatable = false, columnDefinition = "VARCHAR(100)")
	private String nombre; 
	
	private String apellidos; 
	
	private String email;
	
	private List <LocalDate> fechas;
	
	public Alumno(String n, String a, String e) { //CONSTRUCTOR VACÍO PARA EVITAR PONER EL ID (AUTOGENERADO).
		this.nombre = n;
		this.apellidos = a;
		this.email = e;
	}

}
