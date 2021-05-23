public class mathOperations {
    private static char operator;
    private static char choice;
    private static long num1, num2, result;

    // performs addition between numbers
    public static long addition(long num1, long num2) {
        result = num1 + num2;
        return result;
    }

    // performs subtraction between numbers
    public static long subtraction(long num1, long num2) {
        result = num1 - num2;
        return result;
    }

    // performs multiplication between numbers
    public static long multiply(long num1, long num2) {
        result = num1 * num2;
        return result;
    }

    // performs division between numbers
    public static long division(long num1, long num2) {
        if (num2 != 0)
            result = num1 / num2;
        return result;
    }
}

