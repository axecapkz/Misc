import java.util.Scanner;

public class Calculator {
    private static char operator;
    private static double num1, num2, result;

    // Performs addition between numbers
    private static double Addition(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    // Performs subtraction between numbers
    private static double Substraction(double num1, double num2) {
        result = num1 - num2;
        return result;
    }

    // Performs multiplication between numbers
    private static double Multiply(double num1, double num2) {
        result = num1 * num2;
        return result;
    }

    // Performs division between numbers
    private static double Division(double num1, double num2) {
        result = num1 / num2;
        return result;
    }

    public static void main(String[] args) {
        // Creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Asks user to enter operator
        System.out.println("Please choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // Asks user to enter numbers
        System.out.println("Please enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Please enter second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                System.out.println(
                        "Result: " + num1 + " + " + num2 + " = " + Addition(num1, num2));
                break;

            case '-':
                System.out.println(
                        "Result: " + num1 + " - " + num2 + " = " + Substraction(num1, num2));
                break;

            case '*':
                System.out.println(
                        "Result: " + num1 + " * " + num2 + " = " + Multiply(num1, num2));
                break;

            case '/':
                System.out.println(
                        "Result: " + num1 + " / " + num2 + " = " + Division(num1, num2));
                break;

            default:
                System.out.println("Invalid operator! Please re-check.");
                break;
        }
        input.close();
    }
}
