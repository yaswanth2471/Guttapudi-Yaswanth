// Problem-1: Calculator

import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String op) {
        switch (op.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0)
                    return a / b;
                else
                    System.out.println("Cannot divide by zero!");
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String operation = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);

        System.out.println("Result: " + result);
    }
}
