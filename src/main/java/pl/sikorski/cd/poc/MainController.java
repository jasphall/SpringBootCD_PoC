package pl.sikorski.cd.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MainController {

    @GetMapping
    public String hello() {
        return "Hello from brand new deployment!";
    }

    @GetMapping("/v2")
    public String helloInstance() {
        System.out.println("Hello");
        return "Hello from Instance11122233334444!";
    }

}
