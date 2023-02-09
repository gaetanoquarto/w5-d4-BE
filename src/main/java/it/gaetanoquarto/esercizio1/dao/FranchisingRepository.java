package it.gaetanoquarto.esercizio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.gaetanoquarto.esercizio1.entity.Franchising;

@Repository
public interface FranchisingRepository extends JpaRepository<Franchising, Integer>{

}
