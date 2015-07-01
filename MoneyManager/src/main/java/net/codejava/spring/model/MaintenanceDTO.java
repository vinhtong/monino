package net.codejava.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Maintenance")
public class MaintenanceDTO {
	
	private long maintenanceId;
	private long carId;
	private String maintenance;
	private int price;
	private int quality;
	private String detail;
	private Date maintenanceDate;
	
	@Id
	@GeneratedValue
	@Column(name = "MAINTENANCE_ID")
	public long getMaintenanceId() {
		return maintenanceId;
	}
	public void setMaintenanceId(long maintenanceId) {
		this.maintenanceId = maintenanceId;
	}
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public String getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getMaintenanceDate() {
		return maintenanceDate;
	}
	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

}
