package com.salesianostriana.dam.ejemplospringcore3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import jakarta.annotation.PostConstruct;

@Controller
public class MainDeMentira {

	/*Busca algún bean con esta dependencia y si lo encuantras lo guardas.
	Como tenemos 2 (SpanishSaludator y EnglishSaludator) da ERROR.
	
	Para evitar esto utilizamos la etiqueta primary y secondary.
	
	Y si queremos seleccionar uno a la fuerza Qualifier y el nombre con
	la primera en minúscula.*/
	
	@Autowired @Qualifier("englishSaludator")
	private Saludator saludator;
	
	@PostConstruct
	void run() {
		saludator.imprimirSaludo();
	}

}
