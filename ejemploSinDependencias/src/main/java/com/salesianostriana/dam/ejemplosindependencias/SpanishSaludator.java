package com.salesianostriana.dam.ejemplosindependencias;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpanishSaludator implements Saludator {

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		System.out.println("Hola a todos los alumnos de 1ºDAM.");
	}

}
