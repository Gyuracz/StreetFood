package com.example.streetfood;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

    public ArrayList<Subscriber> findAll();
	
}