// Lab 1 Exercises
// Author @ Tan Zhao Yea (1802992)

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        Task1 t1 = new Task1();
//        System.out.println(t1.getAnimal());

        Task2 t2 = new Task2();
        System.out.printf("The BMI is %.2f\n", t2.getBMI());
        System.out.println(t2.getBmiStatus());
    }
}

// Source code for Task 2
class Task2 {
    // BMI Formula: [weight (lb) / height (in) / height (in)] x 703
    String bmiStatus = "";
    double bmi;

    public Task2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble();

        // Reset the buffer
        in.nextLine();

        System.out.print("Enter height in inches: ");
        double height = in.nextDouble();
        // Calculate the BMI
        this.bmi = (weight / height / height) * 703;

        // Check if BMI is Underweight
        if (bmi < 18.5) {
            this.bmiStatus = "Underweight";
        }
        // Check if BMI is Normal
        else if (18.5 <= bmi && bmi < 25.0) {
            this.bmiStatus = "Normal";
        }
        // Check if BMI is Overweight
        else if (25.0 <= bmi && bmi < 30.0) {
            this.bmiStatus = "Overweight";
        }
        // Check if BMI is Obese
        else if (30.0 <= bmi) {
            this.bmiStatus = "Obese";
        }
    }
    public double getBMI() {
        return bmi;
    }
    public String getBmiStatus(){
        return bmiStatus;
    }
}

