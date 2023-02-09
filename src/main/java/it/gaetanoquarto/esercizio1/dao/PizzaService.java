package it.gaetanoquarto.esercizio1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import it.gaetanoquarto.esercizio1.entity.Pizza;


@Service
public class PizzaService {
	
	@Autowired
	private PizzaRepository pizzaRepo;
	
	public void save(Pizza p) {
		pizzaRepo.save(p);
	}

}
