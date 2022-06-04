package com.example.streetfood;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public List<String> getOptions(){
        List<String> options = new ArrayList<String>();
        options.add("Pizza");
        options.add("Hamburger");
        options.add("Saláta");
        return options;
    }

    public SubscriberRepository subscriberRepository;

    @Autowired
    public void setSubscriberRepository(SubscriberRepository sub){
        this.subscriberRepository = sub;
    }

    public PizzaRepository pizzaRepository;

    @Autowired
    public void setPizzaRepository(PizzaRepository p){
        this.pizzaRepository = p;
    }

    public HamburgerRepository hamburgerRepository;

    @Autowired
    public void setHamburgerRepository(HamburgerRepository ham){
        this.hamburgerRepository = ham;
    }

    public SalatRepository salatRepository;

    @Autowired
    public void setSalatRepository(SalatRepository s){
        this.salatRepository = s;
    }
    
    public void subscribe(Subscriber sub){
        subscriberRepository.save(sub);
    }

    public void addPizza(Pizza pizza){
        pizzaRepository.save(pizza);
    }

    public void addHamburger(Hamburger hamburger){
        hamburgerRepository.save(hamburger);
    }

    public void addSalat(Salat salat){
        salatRepository.save(salat);
    }

    public ArrayList<Subscriber> getSubscribers(){
        return subscriberRepository.findAll();
    }

    public ArrayList<Pizza> getPizzas(){
        return pizzaRepository.findAll();
    }

    public ArrayList<Hamburger> getHamburgers(){
        return hamburgerRepository.findAll();
    }

    public ArrayList<Salat> getSalats(){
        return salatRepository.findAll();
    }
    
}
