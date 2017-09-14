package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class RateBasedBillingRecord extends BillingRecord {
	
	@Column(nullable=false)
	private double rate;
	
	@Column(nullable=false)
	private double quantity;
	
	@Override
	public double getTotal() {
		return rate * quantity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
