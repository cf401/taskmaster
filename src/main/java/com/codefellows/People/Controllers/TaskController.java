package com.codefellows.People.Controllers;

import com.codefellows.People.Models.Task;

import com.codefellows.People.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/taskmaster")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List getTasks() {
        return (List) taskRepository.findAll();
    }

    @PostMapping("/tasks")
    public Task addTask (@RequestBody Task task) {
        Task c = new Task();
        c.setName( task.getName() );
        c.setOld( task.getOld() );
        taskRepository.save(c);
        return c;
    }
}
