package com.cap.cinema.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projection {
@jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Date dateProjection;	 
private double prix;
@ManyToOne
private Salle salle;
@ManyToOne
private Film film;

}
