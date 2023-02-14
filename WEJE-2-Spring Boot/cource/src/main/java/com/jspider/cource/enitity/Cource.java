package com.jspider.cource.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cource {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cource Id")
	private int id;
	@Column(name = "Cource Name")
	private String name;
	@Column(name = "Duration in  Month")
	private int duration;
	@Column(name = "Cost of Cource")
	private double cost;
	@Column(name = " Buy Date")
	private String buyDate;
	@Column(name = " End Date")
	private String endDate;
	
	public Cource() {
	
	}

	public Cource(int id, String name, int duration, double cost, String buyDate, String endDate) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.cost = cost;
		this.buyDate = buyDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(String string) {
		this.buyDate = string;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate=endDate;
	}

	@Override
	public String toString() {
		return "Cource [id=" + id + ", name=" + name + ", duration=" + duration + ", cost=" + cost + ", buyDate="
				+ buyDate + ", endDate=" + endDate + "]";
	}

	
	

}
