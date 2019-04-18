package com.sroba.model;

import com.sroba.inter.Inversion;

public class InversionImpl implements Inversion {

	private String inversionType;
	private int amount;
		
	
	public InversionImpl() {
		super();
	}
	
	@Override
	public Inversion makeClone() {
		InversionImpl inversion = null;

		try {
			inversion = (InversionImpl) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return inversion;
	}

	@Override
	public String toString() {
		return "Inversion Type = " + inversionType + ", Amount = " + amount;
	}

	public String getInversionType() {
		return inversionType;
	}

	public void setInversionType(String inversionType) {
		this.inversionType = inversionType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}	
}
