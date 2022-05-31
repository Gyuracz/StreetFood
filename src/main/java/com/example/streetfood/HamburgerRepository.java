package com.example.streetfood;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HamburgerRepository extends CrudRepository<Hamburger, Long> {

    public ArrayList<Hamburger> findAll();
	
}