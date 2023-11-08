package ie.atu.classtestproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClassTestProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassTestProductServiceApplication.class, args);
	}
}