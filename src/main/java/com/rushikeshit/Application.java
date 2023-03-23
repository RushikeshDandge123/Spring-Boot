package com.rushikeshit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(Application.class, args);
		
		Person person = context.getBean(Person.class);
		person.setId(101);
		person.setName("Rishi");
		System.out.println(person);

		String name = "Mahi"

		Integer a = 10;


	}

}
