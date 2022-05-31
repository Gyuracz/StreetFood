package com.example.streetfood;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalatRepository extends CrudRepository<Salat, Long> {

    public ArrayList<Salat> findAll();
	
}