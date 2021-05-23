import java.util.Scanner;

public class Calculator {
    private static char operator;
    private static char choice;
    private static long num1, num2, result;

    public static void main(String[] args) {
        // Creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {
            // asks user to enter numbers
            System.out.println("Please enter numbers:  ... for example \"1 + 3\"");
            num1 = input.nextLong();
            operator = input.next().charAt(0);
            num2 = input.nextLong();

            switch (operator) {
                case '+':
                    System.out.println(
                            "Result: " + num1 + " + " + num2 + " = " + mathOperations
                                    .addition(num1, num2));
                    break;

                case '-':
                    System.out.println(
                            "Result: " + num1 + " - " + num2 + " = " + mathOperations
                                    .subtraction(num1, num2));
                    break;

                case '*':
                    System.out.println(
                            "Result: " + num1 + " * " + num2 + " = " + mathOperations
                                    .multiply(num1, num2));
                    break;

                case '/':
                    if (num2 != 0) {
                        System.out.println(
                                "Result: " + num1 + " / " + num2 + " = " + mathOperations
                                        .division(num1, num2));
                    }
                    else {
                        System.out.println("Not a number");
                    }
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
