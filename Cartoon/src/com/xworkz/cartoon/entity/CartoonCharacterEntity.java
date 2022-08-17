package com.xworkz.cartoon.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cartooncharacter_info")
@NamedQueries({ @NamedQuery(name = "findByName", query = "select cc from CartoonCharacterEntity cc where cc.name=:nm") 
, @NamedQuery(name="findByNameAndCountryAndGenderAndAuthor", query = "select cc from CartoonCharacterEntity cc where "
		+ "cc.name=:ne and cc.country=:cy and cc.gender=:gr and cc.author=:ar ")})

public class CartoonCharacterEntity extends ParentEntity {
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;

	public CartoonCharacterEntity(String name, String country, String gender, String author, String type,
			String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);

		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;

	}

}
