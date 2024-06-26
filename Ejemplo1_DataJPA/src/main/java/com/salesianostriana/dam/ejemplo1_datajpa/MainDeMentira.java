package com.salesianostriana.dam.ejemplo1_datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplo1_datajpa.modelo.Alumno;
import com.salesianostriana.dam.ejemplo1_datajpa.repositorio.AlumnoRepository;

import jakarta.annotation.PostConstruct;

//LAS CLASES QUE SON ENTIDADES NO SE PUEDEN INYECTAR COMO UN BEAN

@Component
public class MainDeMentira {

    @Autowired
    private AlumnoRepository repo;

    @PostConstruct
    public void ejecutar() {
        repo.save(new Alumno("Luis Miguel","López Magaña","luismi.lopez@salesianos.edu"));
        repo.save(new Alumno("Ángel","Naranjo González","angel.naranjo@salesianos.edu"));
        repo.save(new Alumno("Rafael", "Villar Liñán", "rafael.villar@salesianos.edu"));

        //REFERENCIA A MÉTODO
        //X -> Lo.Que.Sea(X)
        //Lo.Que::sea
        
        //repo.findAll().forEach(a -> System.out.println(a));
        repo.findAll().forEach(System.out::println);
    }
}
