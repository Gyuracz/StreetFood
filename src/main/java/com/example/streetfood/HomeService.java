package com.example.streetfood;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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

    // @Value("${spring.mail.username}")
    // private String MESSAGE_FROM;

    // JavaMailSender javaMailSender;

    // @Autowired
    // public void setJavaMailSender(JavaMailSender j){
    //     this.javaMailSender = j;
    // }

    // public void sendMessage(String email){
    //     SimpleMailMessage message = null;
    //     try{
    //         message = new SimpleMailMessage();          
    //         message.setFrom(MESSAGE_FROM);
    //         message.setTo(email);
    //         message.setSubject("StreetFood hírlevél");
    //         message.setText("Köszönjük, hogy feliratkoztál a StreetFood hírleveleire! Garantáltan nem fogod kihagyni a legjobb ajánlatainkat!");
    //         javaMailSender.send(message);
    //     }catch(Exception e){
    //         System.out.println("Nem sikerült elküldeni az üzenetet! " + e);
    //     }
    // }
    
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
