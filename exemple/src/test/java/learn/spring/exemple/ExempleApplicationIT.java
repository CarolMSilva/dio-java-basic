package learn.spring.exemple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class ExempleApplicationIT {

    @Autowired
	private TestRestTemplate template; //o servidor ficou incorporado no webenvironment e abre automaticamente na url tesresttemplate

    @Test
    void getController() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Olá! exemplo Spring Boot!");
    }
}
