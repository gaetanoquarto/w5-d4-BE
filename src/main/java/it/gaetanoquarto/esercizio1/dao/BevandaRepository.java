package it.gaetanoquarto.esercizio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.gaetanoquarto.esercizio1.entity.Bevanda;

@Repository
public interface BevandaRepository extends JpaRepository<Bevanda, Integer> {
	
	

}
