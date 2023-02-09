package it.gaetanoquarto.esercizio1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gaetanoquarto.esercizio1.entity.Bevanda;

@Service
public class BevandaService {
	
	@Autowired
	private BevandaRepository bevandaRepo;
	
	public void save(Bevanda b) {
		bevandaRepo.save(b);
	}

}
