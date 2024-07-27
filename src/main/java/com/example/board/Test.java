package com.example.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Test {

    @GetMapping("/test")
    private String Test(){
        return "forward:/test.html";
    }
}
