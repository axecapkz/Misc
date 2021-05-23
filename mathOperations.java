public class mathOperations {
    private static char operator;
    private static char choice;
    private static double num1, num2, result;

    // performs addition between numbers
    public static double addition(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    // performs subtraction between numbers
    public static double subtraction(double num1, double num2) {
        result = num1 - num2;
        return result;
    }

    // performs multiplication between numbers
    public static double multiply(double num1, double num2) {
        result = num1 * num2;
        return result;
    }

    // performs division between numbers
    public static double division(double num1, double num2) {
        if (num2 != 0)
            result = num1 / num2;
        return result;
    }
}

