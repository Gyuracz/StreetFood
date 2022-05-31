package com.example.streetfood;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hamburgers")
public class Hamburger {

    @GeneratedValue
    @Id
    private Long id;
	
    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "price")
    private int price;

    public Hamburger(){}

    public Hamburger(String name, int price){
        this.name = name;
        this.price = price;
    }
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}