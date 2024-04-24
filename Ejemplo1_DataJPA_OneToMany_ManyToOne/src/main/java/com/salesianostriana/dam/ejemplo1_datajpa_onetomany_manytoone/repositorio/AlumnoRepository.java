package com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.modelo.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
