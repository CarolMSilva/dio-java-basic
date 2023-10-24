package learn.springboot.example;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // add @configuração, enableautoconfiguration, @componentscan
public class ExempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExempleApplication.class, args);
	}

	@Bean //commandlinerunner metodo - executado na inicialização, recupera todos os beans criados na aplicação ou add automaticamente pelo springboot que classifica e imprime.
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
