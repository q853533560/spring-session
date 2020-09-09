package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiveThymeleafController {
    @GetMapping("/five")
    public String indexPage(Model model) {

        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "manager");
        model.addAttribute("manager", "manager");
        return "index5";
    }
}
