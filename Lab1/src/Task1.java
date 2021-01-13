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
            case 0:
                animal = "monkey";
                break;
            case 1:
                animal = "rooster";
                break;
            case 2:
                animal = "dog";
                break;
            case 3:
                animal = "pig";
                break;
            case 4:
                animal = "rat";
                break;
            case 5:
                animal = "ox";
                break;
            case 6:
                animal = "tiger";
                break;
            case 7:
                animal = "rabbit";
                break;
            case 8:
                animal = "dragon";
                break;
            case 9:
                animal = "snake";
                break;
            case 10:
                animal = "horse";
                break;
            case 11:
                animal = "sheep";
                break;
        }
        System.out.println(animal);
    }
}
