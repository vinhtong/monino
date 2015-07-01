package net.codejava.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class CarDTO {
	
	private long carId;
	private String licensePlate;
	private String driver;
	private String supporter;
	private String status;

	@Id
	@GeneratedValue
	@Column(name = "CAR_ID")
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	
	@Column(name = "LICENSE_PLATE")
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	@Column(name = "DRIVER")
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	@Column(name = "SUPPORTER")
	public String getSupporter() {
		return supporter;
	}
	public void setSupporter(String supporter) {
		this.supporter = supporter;
	}
	
	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
