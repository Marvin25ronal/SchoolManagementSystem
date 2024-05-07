package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId("123");
		System.out.println(student.getId());
		Student student2 = new Student();
		student2.setId("456");
		System.out.println(student2.getId());
		Curse curse = new Curse();
		curse.setId(1);

		Curse curse2 = new Curse();
		curse2.setId(2);

		Academic academic = new Academic();
		academic.addCurse(curse);
		academic.addCurse(curse2);

		academic.bookStudent(student, 1);
		academic.bookStudent(student2, 2);

	}

}
