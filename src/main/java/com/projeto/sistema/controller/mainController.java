package com.projeto.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/administrativo")
    public String accessMain(){
        return "administrativo/home";
    }

}
