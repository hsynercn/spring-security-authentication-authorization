package com.mylogin.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class ResourceController {

    private List<String> tasks = Arrays.asList("This", "is", "not", "a", "banana");

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", LocalDateTime.now().toString());
        model.addAttribute("tasks", tasks);

        return "welcome"; //view
    }

    // /hello?name=kotlin
    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "")
                    String name, Model model) {

        model.addAttribute("message", LocalDateTime.now().toString());

        return "welcome"; //view
    }

}
