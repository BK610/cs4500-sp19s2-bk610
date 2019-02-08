package com.example.cs4500_sp19_the_business_side.models;

import java.util.List;
<<<<<<< HEAD
import java.util.ArrayList;
=======

>>>>>>> origin
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.cs4500_sp19_the_business_side.models.Service;
=======
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> origin

@Entity
@Table(name="service_categories")
public class ServiceCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	@OneToMany
	private List<Service> servicesInCategory;
	@ManyToMany
	@JsonIgnore
	@JoinTable(
			name="CATEGORIES_SERVICES",
			joinColumns=@JoinColumn(name="CATEGORY_ID", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn(name="SERVICE_ID", referencedColumnName="ID"))
	private List<Service> services;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	public List<Service> getServicesInCategory(){
		return servicesInCategory;
	}
	
	public void setServicesInCategory(Service service){
		List<Service> list = new ArrayList<Service>();
		list.add(service);
		this.servicesInCategory = list;
	}
	
	public void setServicesInCategory(List<Service> services){
		this.servicesInCategory = services;
	}
	
	public void addService(Service service){
		if (!this.servicesInCategory.contains(service)){
			this.servicesInCategory.add(service);
		}
	}
	
	public void addService(List<Service> services){
		for (Service service : services) {
			if (!this.servicesInCategory.contains(service)){
				this.servicesInCategory.add(service);
			}
		}
	}
	
	public void removeService(Service service){
		if (this.servicesInCategory.contains(service)){
			this.servicesInCategory.remove(service);
		}
	}
	
	public void removeService(List<Service> services){
		for (Service service : services) {
			if (!this.servicesInCategory.contains(service)){
				this.servicesInCategory.remove(service);
			}
		}
	}
	
}