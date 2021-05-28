public class Calculator {

    public static void wNote() {
        System.out.println(
                "Please enter two arabic or roman numbers\"2 + 5\" or \"II + V\" to make simple calculation \n"
                        + "Please note that numbers should be between 1 and 10 range \n"
                        + "Valid operators:  + , - , * , /");
    }

    public static void missedOperator() {
        System.out.println("Please use allowed numbers or operators");
    }

    public static void defineNumbers() {
        wNote();
        String inputLine = MathOperations.inputLine();
        int divisorIndex = MathOperations.divisor(inputLine);
        int num1 = MathOperations.firstNum(inputLine, divisorIndex);
        int num2 = MathOperations.secondNum(inputLine, divisorIndex);
        MathOperations.calc(inputLine, num1, num2, divisorIndex);
    }


    public static void main(String[] args) {

        String s = "";

        while (!s.equals("N")) {
            defineNumbers();
            System.out.println("Would you like to continue Y/N ?");
            s = MathOperations.inputOut().toUpperCase();
        }
    }
}
