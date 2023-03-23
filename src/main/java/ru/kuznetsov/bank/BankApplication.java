package ru.kuznetsov.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}

/*
@RestController
class Controller {
	@GetMapping(path = "/hello/{name}", produces = MediaType.APPLICATON_JSON_VALUE)
	public String hello(@PathVariable String name) {
		return "Hello " + name + "!";
	}
}*/
