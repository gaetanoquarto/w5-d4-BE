package it.gaetanoquarto.esercizio1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.gaetanoquarto.esercizio1.entity.Bevanda;

@Configuration
@PropertySource("classpath:application.properties")
public class BevandaConfig {
	
	@Bean
	public Bevanda b() {
		Bevanda b = new Bevanda();
		b.setNome("Acqua(0.5l)");
		b.setCalorie(5);
		b.setPrezzo(2.00);

		return b;
	}

}
