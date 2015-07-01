package net.codejava.spring.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHO")
public class PhoDTO {

	private long phoId;
	private long routeId;
	private String stage;
	private int customerQuantity;
	private int price;
	private Date startDate;
	private Date endDate;
	private Time startTime;
	private Time endTime;
	
	@Id
	@GeneratedValue
	@Column(name = "PHO_ID")
	public long getPhoId() {
		return phoId;
	}
	public void setPhoId(long phoId) {
		this.phoId = phoId;
	}
	public long getRouteId() {
		return routeId;
	}
	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public int getCustomerQuantity() {
		return customerQuantity;
	}
	public void setCustomerQuantity(int customerQuantity) {
		this.customerQuantity = customerQuantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

}
