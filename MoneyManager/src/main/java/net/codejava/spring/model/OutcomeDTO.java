package net.codejava.spring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OUTCOME")
public class OutcomeDTO {

//	CREATE TABLE `OUTCOME` (
//	  `OUTCOME_ID` int(11) NOT NULL AUTO_INCREMENT,
//	  `PHO_ID` int(11) NOT NULL,
//	  `CONTENT` varchar(300) NOT NULL,
//	  `QUANTITY` int(11) NOT NULL,
//	  `PRICE` int(11) NOT NULL,
//	  `DESCRIPTION` varchar(700),
//	  `IS_PAID` boolean,
//	  `OUTCOME_DATE` datetime NOT NULL,
//	  PRIMARY KEY (`OUTCOME_ID`)
//	) ENGINE=InnoDB AUTO_INCREMENT=16;

	private long outcomeId;
	private long phoId;
	private String content;
	private int quantity;
	private int price;
	private String description;
	private boolean idPaid;
	private Date outcomeDate;
	
	@Id
	@GeneratedValue
	@Column(name = "OUTCOME_ID")
	public long getOutcomeId() {
		return outcomeId;
	}
	public void setOutcomeId(long outcomeId) {
		this.outcomeId = outcomeId;
	}
	public long getPhoId() {
		return phoId;
	}
	public void setPhoId(long phoId) {
		this.phoId = phoId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIdPaid() {
		return idPaid;
	}
	public void setIdPaid(boolean idPaid) {
		this.idPaid = idPaid;
	}
	public Date getOutcomeDate() {
		return outcomeDate;
	}
	public void setOutcomeDate(Date outcomeDate) {
		this.outcomeDate = outcomeDate;
	}
	
	

}
