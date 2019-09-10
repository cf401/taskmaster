package com.codefellows.People;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskRepository {

	@Value("${amazon.aws.accesskey}")
	private static String amazonAWSAccessKey;

	public static void main(String[] args) {
		SpringApplication.run(TaskRepository.class, args);

		public void findTaskById(String id);
		public static void findAll();

		System.out.println("Onward and Upward!");
	}

}
