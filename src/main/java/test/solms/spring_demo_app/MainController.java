package test.solms.spring_demo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api")
    public String test(){
        return "Hello!";
    }
}
