package it.gaetanoquarto.esercizio1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gaetanoquarto.esercizio1.entity.Franchising;

@Service
public class FranchisingService {

	@Autowired
	private FranchisingRepository franchisingRepo;
	
	public void save(Franchising f) {
		franchisingRepo.save(f);
	}
}
