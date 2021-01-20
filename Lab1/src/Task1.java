// Lab 1 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 1

import java.util.Scanner;

class Zodiac {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String animal = "";
        // Prepare the Scanner Input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = in.nextInt();

        switch (year % 12) {
            case 0 -> animal = "monkey";
            case 1 -> animal = "rooster";
            case 2 -> animal = "dog";
            case 3 -> animal = "pig";
            case 4 -> animal = "rat";
            case 5 -> animal = "ox";
            case 6 -> animal = "tiger";
            case 7 -> animal = "rabbit";
            case 8 -> animal = "dragon";
            case 9 -> animal = "snake";
            case 10 -> animal = "horse";
            case 11 -> animal = "sheep";
        }
        System.out.println(animal);
    }
}
