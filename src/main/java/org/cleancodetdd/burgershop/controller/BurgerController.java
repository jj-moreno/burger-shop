package org.cleancodetdd.burgershop.controller;

import org.cleancodetdd.burgershop.model.Burger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BurgerController {

    @RequestMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/burgerMaker")
    public String makeBurgerForm(Model model) {
        model.addAttribute("builder", new Burger.Builder());
        return "make-burger";
    }

    @PostMapping("/burgerConfirmed")
    public String makeBurgerConfirm(@ModelAttribute Burger.Builder builder, Model model) {
        model.addAttribute("burger", builder.build());
        return "confirmation";
    }
}
