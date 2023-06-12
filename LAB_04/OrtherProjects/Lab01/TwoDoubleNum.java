
//Write a program to calculate sum, difference, product, and quotient of 2 double numbers which
//are entered by users.
import java.util.Scanner;

public class TwoDoubleNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println("Sum of two numbers: " + (num1 + num2));
        System.out.println("Difference of two numbers: " + (num1 - num2));
        System.out.println("Product of two numbers: " + (num1 * num2));
        System.out.println("Quotient of two numbers: " + (num1 / num2));
        input.close();
    }
}