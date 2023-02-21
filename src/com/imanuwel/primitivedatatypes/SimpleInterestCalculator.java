package com.imanuwel.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private final BigDecimal principal;
    private final BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        return principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
    }
}
