package com.salesianostriana.dam.ejemplospringcore3;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("FERIA DOESN´T EXISTS IN ENGLAND :O");
		
	}

}
