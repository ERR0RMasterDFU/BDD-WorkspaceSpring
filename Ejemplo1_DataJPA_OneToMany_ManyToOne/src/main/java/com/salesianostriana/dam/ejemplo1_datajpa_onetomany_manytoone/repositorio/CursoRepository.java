package com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{ 

}
