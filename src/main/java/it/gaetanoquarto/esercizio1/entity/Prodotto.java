package it.gaetanoquarto.esercizio1.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "prodotti")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name = "Prodotto_Type", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Scope("prototype")
public abstract class Prodotto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	protected double prezzo;
	protected String nome;
}

