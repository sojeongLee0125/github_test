package github_test.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "To-do Application !";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello !";
    }
}

