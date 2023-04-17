package exercise6;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fullname = keyboard.nextLine();
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();
        System.out.println("Enter your weight and height: ");
        double height = keyboard.nextDouble();
        double weight = keyboard.nextDouble();
        System.out.println("Hello, my name is " + fullname + ". I am " + age +
                "years old!. My height and weight: " + height + " " + weight);
    }
}
