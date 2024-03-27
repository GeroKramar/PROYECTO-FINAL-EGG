package com.grupo1.PROYECTOFINALEGG.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer property;

	@OneToOne
	private Client user;

	@OneToOne
	private Owner owner;

	@Temporal(TemporalType.DATE)
	private Date date;
	private Double total;

	@ElementCollection
	@CollectionTable(name = "listOfHiredServices")
	@OneToMany
	private List<Service> services = new ArrayList<>();

}
