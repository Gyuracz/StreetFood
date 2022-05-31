package com.example.streetfood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public HomeService homeService;

    @Autowired
    public void setHomeService(HomeService h){
        this.homeService = h;
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("subscriber", new Subscriber());
        return "index";
    }

    @RequestMapping("/etlap")
    public String etlap(Model model){
        model.addAttribute("subscriber", new Subscriber());
        model.addAttribute("pizzas", homeService.getPizzas());
        model.addAttribute("hamburgers", homeService.getHamburgers());
        model.addAttribute("salats", homeService.getSalats());
        return "etlap";
    }

    @RequestMapping("/rolunk")
    public String rolunk(Model model){
        model.addAttribute("subscriber", new Subscriber());
        return "rolunk";
    }

    @RequestMapping("/admin")
    public String admin(Model model){
        model.addAttribute("pizza", new Pizza());
        model.addAttribute("hamburger", new Hamburger());
        model.addAttribute("salat", new Salat());
        model.addAttribute("options", homeService.getOptions());
        model.addAttribute("pizzas", homeService.getPizzas());
        model.addAttribute("hamburgers", homeService.getHamburgers());
        model.addAttribute("salats", homeService.getSalats());
        model.addAttribute("subscribers", homeService.getSubscribers());
        return "admin";
    }

    @PostMapping("/subproc")
    public String subproc(@ModelAttribute Subscriber subscriber, Model model){
        homeService.subscribe(subscriber);
        // homeService.sendMessage(subscriber.getEmail());
        model.addAttribute("subscriber", new Subscriber());
        return "index";
    }

    @PostMapping("/addpizza")
    public String addPizza(@ModelAttribute Pizza pizza, Model model){
        homeService.addPizza(pizza);
        model.addAttribute("pizza", new Pizza());
        model.addAttribute("hamburger", new Hamburger());
        model.addAttribute("salat", new Salat());
        model.addAttribute("options", homeService.getOptions());
        model.addAttribute("pizzas", homeService.getPizzas());
        model.addAttribute("hamburgers", homeService.getHamburgers());
        model.addAttribute("salats", homeService.getSalats());
        model.addAttribute("subscribers", homeService.getSubscribers());
        return "admin";
    }

    @PostMapping("/addhamburger")
    public String addHamburger(@ModelAttribute Hamburger hamburger, Model model){
        homeService.addHamburger(hamburger);
        model.addAttribute("pizza", new Pizza());
        model.addAttribute("hamburger", new Hamburger());
        model.addAttribute("salat", new Salat());
        model.addAttribute("options", homeService.getOptions());
        model.addAttribute("pizzas", homeService.getPizzas());
        model.addAttribute("hamburgers", homeService.getHamburgers());
        model.addAttribute("salats", homeService.getSalats());
        model.addAttribute("subscribers", homeService.getSubscribers());
        return "admin";
    }

    @PostMapping("/addsalat")
    public String assSalat(@ModelAttribute Salat salat, Model model){
        homeService.addSalat(salat);
        model.addAttribute("pizza", new Pizza());
        model.addAttribute("hamburger", new Hamburger());
        model.addAttribute("salat", new Salat());
        model.addAttribute("options", homeService.getOptions());
        model.addAttribute("pizzas", homeService.getPizzas());
        model.addAttribute("hamburgers", homeService.getHamburgers());
        model.addAttribute("salats", homeService.getSalats());
        model.addAttribute("subscribers", homeService.getSubscribers());
        return "admin";
    }

}