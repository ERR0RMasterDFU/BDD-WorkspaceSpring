package com.salesianostriana.dam.ejemplo1_datajpa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplo1_datajpa.modelo.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
