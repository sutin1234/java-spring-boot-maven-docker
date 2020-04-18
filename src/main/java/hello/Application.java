package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
public class Application {

	@Value("${say.msg}")
	String message;

	@GetMapping("/")
	public String index(){
		return message;
	}

	@RequestMapping("/home")
	public String home() {
		return "Hello World Java Spring Boot Maven 66666"; 
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
