package com.salesianostriana.dam.ejemplospringcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
//@RequiredArgsConstructor
public class MainDeMentira {

	@Autowired
	//@Qualifier("englishSaludator")
	private Saludator saludator;
	
	@PostConstruct
	public void init(){
		
		Saludator ss = new SpanishSaludator();
		
		saludator.imprimirSaludo();

	}

}
