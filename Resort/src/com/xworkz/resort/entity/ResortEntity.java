package com.xworkz.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name="resort_details")
public class ResortEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="check_In_Time")
	private LocalTime checkInTime;
	@Column(name="check_Out_Time")
	private LocalTime checkOutTime;
	@Column(name="create_By")
	private String createBy;
	@Column(name="create_Date")
	private LocalDate createDate;
	@Column(name="update_Date")
	private LocalDate updateDate;
	@Column(name="owner")
	private String owner;
	@Column(name="price_Per_Day")
	private double pricePerDay;
}