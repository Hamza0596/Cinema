package com.cap.cinema.Entity;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Salle {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int nombreplaces;
	@ManyToOne
	private Cinema cinema;
	@OneToMany(mappedBy = "salle")
    private Collection<Place> place;
	@OneToMany(mappedBy = "salle")
    private Collection<Projection> projection ;

	

}
