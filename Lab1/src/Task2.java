import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        String bmiStatus = "";
        double bmi;

        // Prepare the Scanner Input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble();

        // Reset the buffer
        in.nextLine();

        System.out.print("Enter height in inches: ");
        double height = in.nextDouble();

        // Calculate the BMI
        bmi = (weight / height / height) * 703;

        // Check if BMI is Underweight
        if (bmi < 18.5) {
            bmiStatus = "Underweight";
        }
        // Check if BMI is Normal
        else if (18.5 <= bmi && bmi < 25.0) {
            bmiStatus = "Normal";
        }
        // Check if BMI is Overweight
        else if (25.0 <= bmi && bmi < 30.0) {
            bmiStatus = "Overweight";
        }
        // Check if BMI is Obese
        else if (30.0 <= bmi) {
            bmiStatus = "Obese";
        }

        System.out.printf("The BMI is %.2f\n", bmi);
        System.out.println(bmiStatus);
    }
}
