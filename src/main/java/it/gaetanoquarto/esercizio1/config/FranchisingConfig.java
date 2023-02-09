package it.gaetanoquarto.esercizio1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.gaetanoquarto.esercizio1.entity.Bevanda;
import it.gaetanoquarto.esercizio1.entity.Franchising;

@Configuration
@PropertySource("classpath:application.properties")
public class FranchisingConfig {
	
	@Bean
	public Franchising f() {
		Franchising f = new Franchising();
		f.setNome("Acqua(0.5l)");
		f.setPrezzo(2.00);

		return f;
	}

}
