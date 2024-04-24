package com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.modelo.Alumno;
import com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.modelo.Curso;
import com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.repositorio.AlumnoRepository;
import com.salesianostriana.dam.ejemplo1_datajpa_onetomany_manytoone.repositorio.CursoRepository;
import jakarta.annotation.PostConstruct;

//LAS CLASES QUE SON ENTIDADES NO SE PUEDEN INYECTAR COMO UN BEAN

@Component
public class MainDeMentira {

    @Autowired
    private AlumnoRepository alumnoRepo;
    
    @Autowired
    private CursoRepository cursoRepo;

    @PostConstruct
    public void ejecutar() {
    	
    	Curso c = new Curso ("1ºDAM", "Miguel Campos");
    	cursoRepo.save(c);
    	
    	alumnoRepo.save(new Alumno("Luis Miguel","López Magaña","luismi.lopez@salesianos.edu", c));
    	alumnoRepo.save(new Alumno("Ángel","Naranjo González","angel.naranjo@salesianos.edu", c));
    	alumnoRepo.save(new Alumno("Rafael", "Villar Liñán", "rafael.villar@salesianos.edu", c));

        //REFERENCIA A MÉTODO
        //X -> Lo.Que.Sea(X)
        //Lo.Que::sea
        
        //repo.findAll().forEach(a -> System.out.println(a));
        alumnoRepo.findAll().forEach(System.out::println);
    }
}
