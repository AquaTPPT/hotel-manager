package com.aquatp.hotel_manager.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class MainController {

    @GetMapping({"/", "/index", ""})
    public String index() {
        return "index.html";
    }
}
