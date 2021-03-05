// Lab 4 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 3


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of slices");
        int slices = in.nextInt();

        System.out.println("Enter number of toppings");
        int toppings = in.nextInt();

        OrderPizza op = new OrderPizza(slices, toppings);
        op.placeOrder();
    }
}

interface Pizza {
    void calculatePizzaCost();
}

abstract class PizzaTopping {
    private int noOfToppings;

    abstract void assignToppings();

    public void addToppings() {
        System.out.println("----+++++----");
    }

    public void setNoOfToppings(int toppings) {
        this.noOfToppings = toppings;
    }

    public int getNoOfToppings() {
        return noOfToppings;
    }
}

class OrderPizza extends PizzaTopping implements Pizza {
    private int noOfSlices;

    // Default Constructor with default toppings and slices
    OrderPizza() {
        super.setNoOfToppings(3);
        this.noOfSlices = 6;
    }

    // Parametrized Constructor
    OrderPizza(int slices, int toppings) {
        super.setNoOfToppings(toppings);
        this.noOfSlices = slices;
    }

    @Override
    void assignToppings() {
        System.out.printf("Putting %d toppings\n", super.getNoOfToppings());
    }

    @Override
    public void calculatePizzaCost() {
        System.out.printf("Cost of order:%d\n", noOfSlices * super.getNoOfToppings());
    }

    public void placeOrder() {
        System.out.println("Placing Order");
        assignToppings();

        System.out.println("Processing Order");
        calculatePizzaCost();

        System.out.println("Baking slices");
        for (int i = 0; i < noOfSlices; i++) {
            System.out.printf("Adding topping on slice %d\n", i + 1);
            addToppings();
        }
        System.out.println("Order Completed");
    }

}