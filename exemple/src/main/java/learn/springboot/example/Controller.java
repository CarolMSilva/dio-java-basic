package learn.springboot.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//sinalização da classe = pronta para Spring usar ela na web
public class Controller {

	@GetMapping("/") // mapeia / para o index () metodo - quanto usado ele no navegador faz com texto puro
	public String index() {
		return "Olá! exemplo Spring Boot!";
	}

}


//@restcontroller, controller e reponsebody suas solicitações retornam dados da web quando visualizadas.