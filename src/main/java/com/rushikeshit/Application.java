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
<<<<<<< HEAD
		String name = "Mahi"
=======
		Integer a = 10;
>>>>>>> 636c7e82a7a9d4e933a3fc7116834f2517215dec

	}

}
