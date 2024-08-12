package com.example;

public class USTaxCalculationStrategy implements TaxCalculationStrategy {
    @Override
    public double calculateTax(double income) {
        double tax = 0;
        if (income <= 9875) {
            tax = income * 0.10;
        } else if (income <= 40125) {
            tax = 987.50 + (income - 9875) * 0.12;
        } else if (income <= 85525) {
            tax = 4617.50 + (income - 40125) * 0.22;
        } else if (income <= 163300) {
            tax = 14605.50 + (income - 85525) * 0.24;
        }
        // Continue the logic as per US tax brackets...
        return tax;
    }
}
