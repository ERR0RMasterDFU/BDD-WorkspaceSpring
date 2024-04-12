package com.salesianostriana.dam.ejemplospringcore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

	@Autowired
	private Saludator saludator;
	
	@GetMapping("/")
	@ResponseBody //solo para este ejemplo
	public String welcome() {
		return saludator.imprimirSaludo();
	}
}
