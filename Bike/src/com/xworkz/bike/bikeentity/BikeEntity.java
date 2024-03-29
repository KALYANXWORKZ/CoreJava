package com.xworkz.bike.bikeentity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name= "bike")
public class BikeEntity {
	@Id
	private int id;
	private String brand;
	private int model;
	private String owner;
	private String createdBy;
	private LocalDate createDate;
	private LocalDate updateDate;
	private double price;
	private String millege;
	

}
