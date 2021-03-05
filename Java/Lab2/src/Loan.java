// Lab 2 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 1

import java.lang.Math;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get Annual Interest Rate
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = in.nextDouble();

        // Get Number of years to Loan
        System.out.print("\nEnter number of years as an integer: ");
        int numberOfYears = in.nextInt();

        // Get Loan Amount
        System.out.print("\nEnter loan amount, for example, 120000. 95: ");
        double loanAmount = in.nextDouble();

        // Calculate the Loan
        Loan l1 = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.println("\nThe loan was created:");
        System.out.printf("The monthly payment is %.2f\n", l1.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", l1.getAnnualPayment());
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    // Default Constructor
    public Loan() {

    }

    // Setter Constructor
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        return (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1+monthlyInterestRate, numberOfYears*12)));
    }

    public double getAnnualPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
