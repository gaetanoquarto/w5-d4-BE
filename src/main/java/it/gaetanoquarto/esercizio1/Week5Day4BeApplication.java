package it.gaetanoquarto.esercizio1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.gaetanoquarto.esercizio1.config.BevandaConfig;
import it.gaetanoquarto.esercizio1.config.FranchisingConfig;
import it.gaetanoquarto.esercizio1.config.PizzaConfig;
import it.gaetanoquarto.esercizio1.dao.BevandaService;
import it.gaetanoquarto.esercizio1.dao.FranchisingService;
import it.gaetanoquarto.esercizio1.dao.PizzaService;
import it.gaetanoquarto.esercizio1.entity.Bevanda;
import it.gaetanoquarto.esercizio1.entity.Franchising;
import it.gaetanoquarto.esercizio1.entity.Pizza;
import it.gaetanoquarto.esercizio1.entity.Prodotto;




@SpringBootApplication
public class Week5Day4BeApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(Week5Day4BeApplication.class, args);
	}

	@Autowired
	PizzaService pizzaS;
//	@Autowired
//	BevandaService bevandaS;
	@Autowired
	FranchisingService franchisingS;
	
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaConfig.class);
//	ApplicationContext ctxB = new AnnotationConfigApplicationContext(BevandaConfig.class);
	ApplicationContext ctxF = new AnnotationConfigApplicationContext(FranchisingConfig.class);

	@Override
	public void run(String... args) throws Exception {
		boolean insertPizza = false;
		if( insertPizza ) {
			savePizza();
			System.out.println("Pizza inserita correttamente!");
		}
		
//		boolean insertBevanda = false;
//		if( insertBevanda ) {
//			saveBevanda();
//			System.out.println("Bevanda inserita correttamente!");
//		}
		boolean insertFr = true;
		if( insertFr ) {
			saveFranchising();
			System.out.println("Franchising inserita correttamente!");
		}
	}
	
	public void savePizza() {
		Pizza p = (Pizza)ctx.getBean("p");
		pizzaS.save(p);
	}
	
//	public void saveBevanda() {
//		Bevanda b = (Bevanda)ctxB.getBean("b");
//		bevandaS.save(b);
//	}
	public void saveFranchising() {
		Franchising f = (Franchising)ctxF.getBean("f");
		franchisingS.save(f);
	}
	

}
