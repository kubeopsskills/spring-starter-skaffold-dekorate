package guru.kubeops.cloudnative.starter.helloworlddemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld-demo/v1")
@RefreshScope
public class MainController {

    @Value("${helloworld.message}")
    private String message;

    @GetMapping("/print")
    public String print(){
        return message;
    }

}
