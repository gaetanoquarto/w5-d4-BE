package it.gaetanoquarto.esercizio1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



import it.gaetanoquarto.esercizio1.entity.Pizza;


@Configuration
@PropertySource("classpath:application.properties")
public class PizzaConfig {
	

		@Bean
		public Pizza p() {
			Pizza p = new Pizza();
			p.setNome("Margherita");
			p.setIngredienti("pomodoro, mozzarella");
			p.setCalorie(1010);
			p.setPrezzo(5.20);

			return p;
		}
	
}
