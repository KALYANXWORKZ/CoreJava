package com.xworkz.airportentity;

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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="airport")
public class AirportEntity {
	@Id
	private int id;
	private String name;
	private int model;
	private String createdBy;
	private String updatedBy;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String purpose;
	private double price;


}
