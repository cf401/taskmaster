package com.codefellows.People.Repository;

import com.codefellows.People.Models.Task;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface CustomerRepository extends CrudRepository<Task, String> {
    Optional<Task> findById(String id);
}
