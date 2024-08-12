package com.example;

public class Main {
    public static void main(String[] args) {
        double income = 60000;

        // Using US Tax Calculation Strategy
        TaxCalculator calculator = new TaxCalculator(new USTaxCalculationStrategy());
        System.out.println("US Tax: " + calculator.calculateTax(income));

        // Using EU Tax Calculation Strategy
        calculator.setStrategy(new EUTaxCalculationStrategy());
        System.out.println("EU Tax: " + calculator.calculateTax(income));

        // Using India Tax Calculation Strategy
        calculator.setStrategy(new IndiaTaxCalculationStrategy());
        System.out.println("India Tax: " + calculator.calculateTax(income));
    }
}
