package com.example.streetfood;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscribers")
public class Subscriber {
    
    @GeneratedValue
    @Id
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    public Subscriber(){}

    public Subscriber(String email){
        this.email = email;
    }
	
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}