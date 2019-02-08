package com.example.cs4500_sp19_the_business_side.models;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.cs4500_sp19_the_business_side.models.Service;

@Entity
@Table(name="service_categories")
public class ServiceCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String serviceCategoryName;
	@OneToMany
	private List<Service> servicesInCategory;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getServiceCategoryName() {
		return serviceCategoryName;
	}
	public void setServiceCategoryName(String serviceCategoryName) {
		this.serviceCategoryName = serviceCategoryName;
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