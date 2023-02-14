package todo.example.github.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubTestController {

    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application!";
    }
}
