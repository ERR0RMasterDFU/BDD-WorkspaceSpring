package com.salesianostriana.dam.ejemplospringcore3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service @Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("HOLA A LOS MUY FERIANTES :P.");
	}

}
