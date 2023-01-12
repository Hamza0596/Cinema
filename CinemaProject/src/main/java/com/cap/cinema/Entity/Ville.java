package com.cap.cinema.Entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ville {

	 @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name="name")
		private String name;
		private double longitude,latitude,altitude;
	    private int nombreSalles;
	    @OneToMany(mappedBy = "ville")
	    private Collection<Cinema> cinema;
	    
}
