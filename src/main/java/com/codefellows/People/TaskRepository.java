package com.codefellows.People;

import com.codefellows.People.Models.Task;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TaskRepository {

	@Value("${amazon.aws.accesskey}")
	private static String amazonAWSAccessKey;

	public static void main(String[] args) {
		SpringApplication.run(TaskRepository.class, args);



		System.out.println("Onward and Upward!");
	}

	public Task findById(String id){};

	public List<Task> findAll() {};
}
