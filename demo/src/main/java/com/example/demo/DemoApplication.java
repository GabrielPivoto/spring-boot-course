package com.example.demo;

import com.example.demo.model.Estudante;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Estudante> hello(){
		return List.of(new Estudante(
				"Gabriel",
				22,
				LocalDate.of(1999,8,31),
				"gabriel-pivoto@outlook.com"
		));
	}
}
