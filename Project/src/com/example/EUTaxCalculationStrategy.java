package com.example;

public class EUTaxCalculationStrategy implements TaxCalculationStrategy {
    @Override
    public double calculateTax(double income) {
        double tax = income * 0.25; // Flat 25% tax for simplicity
        return tax;
    }
}
