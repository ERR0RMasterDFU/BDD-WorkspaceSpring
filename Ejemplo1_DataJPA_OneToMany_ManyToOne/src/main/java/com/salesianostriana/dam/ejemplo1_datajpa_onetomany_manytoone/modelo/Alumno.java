package com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.modelo;

import jakarta.persistence.Entity; //Detecta la clase como una entidad.
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue; //El valor es generado por la BDD.
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //Clave primaria.
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Entity
public class Alumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String apellidos;
	private String email;

    public Alumno(String nombre, String apellidos, String email, Curso curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.curso = curso;
	}

	@ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name="fk_alumno_curso"))
    private Curso curso;
	
//---MANY TO ONE----------------------------------------------------------------------------------------------
	
	public void addToCurso(Curso c) {
		this.curso = c;
		c.getAlumnos().add(this);
	}
	
	public void removeFromCurso(Curso c) {
		c.getAlumnos().remove(this);
		this.curso = null;		
	}
	

}

