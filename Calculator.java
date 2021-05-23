import java.util.Scanner;

public class Calculator {
    private static char operator;
    private static char choice;
    private static double num1, num2, result;

    // performs addition between numbers
    private static double Addition(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    // performs subtraction between numbers
    private static double Substraction(double num1, double num2) {
        result = num1 - num2;
        return result;
    }

    // performs multiplication between numbers
    private static double Multiply(double num1, double num2) {
        result = num1 * num2;
        return result;
    }

    // performs division between numbers
    private static double Division(double num1, double num2) {
        result = num1 / num2;
        return result;
    }

    public static void main(String[] args) {
        // Creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {
            // asks user to enter numbers
            System.out.println("Please enter numbers: ");
            num1 = input.nextDouble();
            operator = input.next().charAt(0);
            num2 = input.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println(
                            "Result: " + num1 + " + " + num2 + " = " + Addition(num1, num2));
                    break;

                case '-':
                    System.out.println(
                            "Result: " + num1 + " - " + num2 + " = " + Substraction(num1,
                                                                                    num2));
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
            // get the choice from the user to add more number
            System.out.print("Enter \"Y\" to continue or \"N\" to exit: ");
            choice = input.next().charAt(0);

        }
        while (choice == 'Y' || choice == 'y');
        input.close();

    }
}
