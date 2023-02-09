package it.gaetanoquarto.esercizio1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bevande")
@Getter
@Setter
@ToString
@Builder
@Scope("prototype")
@NoArgsConstructor
public class Franchising extends Prodotto{

	
	

}
