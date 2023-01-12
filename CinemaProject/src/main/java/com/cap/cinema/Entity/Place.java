package com.cap.cinema.Entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Place {
	 @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String numero;
		private double longitude,latitude,altitude;
		@ManyToOne
	    private Salle salle;
		 
	   
}
