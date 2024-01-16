package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterstCalculator {

	BigDecimal principal;

	BigDecimal interest;

	public SimpleInterstCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		//Total Value = principal + (principal * interest * noOfYears);
		BigDecimal value = this.principal
				.add(this.principal.multiply(this.interest).multiply(new BigDecimal(noOfYears)));
		
		return value;
	}

}
