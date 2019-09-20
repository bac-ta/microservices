package demo.backend.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"demo.backend", "demo.service"})
public class MasterApplication {
	public static void main(String[] args) {
		SpringApplication.run(MasterApplication.class, args);
	}
}
