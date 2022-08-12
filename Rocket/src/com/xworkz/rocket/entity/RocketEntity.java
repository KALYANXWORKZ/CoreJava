package com.xworkz.rocket.entity;

import javax.persistence.Column;
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

@Table(name= "rocket_details")
public class RocketEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "made_In")
	private String madeIn;
	@Column(name = "color")
	private String color;
	@Column(name = "price")
	private double price;
	@Column(name = "purpose")
	private String purpose;
	@Column(name = "weight")
	private String weight;

}
