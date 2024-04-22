package com.salesianostriana.dam.ejemplospringcore3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service @Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("HOLA A LOS MUY FERIANTES :P.");
	}

	@PostConstruct
	void alComenzar() {
		System.out.println("Método \"alComenzar\" anotado con PostConstruct.");
	}
	
	@PreDestroy
	void alAcabar() {
		System.out.println("Método \"alAcabar\" anotado con PreDestroy.");
	}
}
