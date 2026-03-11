package com.aulaback.aula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aula1in")
public class Aula1In {
	
	@GetMapping("/divisao/{n1}/{n2}")
	public String divisao(@PathVariable double n1, @PathVariable double n2) {
		if(n1 == 0)
			return "Impossível dividir por zero";
		else
			return Double.toString(n1 / n2);
	}
}
