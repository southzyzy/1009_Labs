// Lab 4 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 1

public class Task1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Milo", 2, "Brown");
        Cat cat = new Cat("Whiskey",3,"Brown");
        Duck duck = new Duck("Do",1,"White");
        Pig pig = new Pig("Po", 10,"Pink");

        dog.printInfo();
        cat.printInfo();
        duck.printInfo();
        pig.printInfo();
    }
}

class Animal {
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("In animal constructor");
    }

    public void greetings() { }

    public void printInfo() { }
}

class Dog extends Animal {

    public Dog(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In dog constructor");
    }

    @Override
    public void greetings() {
        System.out.print("Woof woof");
    }

    @Override
    public void printInfo() {
        System.out.printf("Dog %s is %d years old and is of %s color ", super.name, super.age, super.color);
        greetings();
        System.out.println();
    }
}

class Cat extends Animal {

    public Cat(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In cat constructor");
    }

    @Override
    public void greetings() {
        System.out.print("Meow");
    }

    @Override
    public void printInfo() {
        System.out.printf("Cat %s is %d years old and is of %s color ", super.name, super.age, super.color);
        greetings();
        System.out.println();
    }
}

class Duck extends Animal {

    public Duck(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In duck constructor");
    }

    @Override
    public void greetings() {
        System.out.print("Quack");
    }

    @Override
    public void printInfo() {
        System.out.printf("Duck %s is %d years old and is of %s color ", super.name, super.age, super.color);
        greetings();
        System.out.println();
    }
}

class Pig extends Animal {

    public Pig(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In pig constructor");
    }

    @Override
    public void greetings() {
        System.out.print("Oink");
    }

    @Override
    public void printInfo() {
        System.out.printf("Pig %s is %d years old and is of %s color ", super.name, super.age, super.color);
        greetings();
        System.out.println();
    }
}