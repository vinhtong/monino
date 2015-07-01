package net.codejava.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROUTE")
public class RouteDTO {
	
	private long routeId;
	private long carId;
	private String routeName;
	private int totalCustomer;
	private int count;
	private int income;
	private int outcome;
	private int oilUsed;
	private Date routeDate;
	
	@Id
	@GeneratedValue
	@Column(name = "ROUTE_ID")
	public long getRouteId() {
		return routeId;
	}
	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public int getTotalCustomer() {
		return totalCustomer;
	}
	public void setTotalCustomer(int totalCustomer) {
		this.totalCustomer = totalCustomer;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getOutcome() {
		return outcome;
	}
	public void setOutcome(int outcome) {
		this.outcome = outcome;
	}
	public int getOilUsed() {
		return oilUsed;
	}
	public void setOilUsed(int oilUsed) {
		this.oilUsed = oilUsed;
	}
	public Date getRouteDate() {
		return routeDate;
	}
	public void setRouteDate(Date routeDate) {
		this.routeDate = routeDate;
	}

	
	
	

}
