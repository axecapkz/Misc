import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathOperations extends Calculator {


    private static boolean rNum = false;

    static String inputOut() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    static String inputLine() {

        Scanner input = new Scanner(System.in);
        String nums = input.nextLine();

        Pattern rP = Pattern.compile("[IVXLCDM]");
        Pattern aP = Pattern.compile("[0-9]");
        Matcher mA = aP.matcher(nums);
        Matcher mR = rP.matcher(nums);
        if (mR.find() && mA.find()) {
            nums = "10§10";
        }
        return nums;
    }


    static int divisor(String inputLine) {

        int exit = 0;

        for (int i = 0; i < inputLine.length(); i++) {
            if (inputLine.charAt(i) == '-' || inputLine.charAt(i) == '+'
                    || inputLine.charAt(i) == '*'
                    || inputLine.charAt(i) == '/') {
                exit = i;
                break;
            }
        }
        return exit;
    }


    static int getNumberRomanOrArabic(String st) {
        int num = 0;
        if (st.matches("[0-9]+")) {
            num = Integer.parseInt(st);
        }
        else if (st.matches("[IVXLCDM]+")) {
            for (RomanNumbers gn : RomanNumbers.values()) {
                if (st.equals(gn.getKey())) {
                    num = gn.getValue();
                    rNum = true;
                    break;
                }
            }

        }
        else {
            num = -1;
        }
        return num;
    }

    static int firstNum(String inputLine, int exit) {
        String fn = (inputLine.substring(0, exit)).trim();
        return getNumberRomanOrArabic(fn);
    }


    static int secondNum(String inputLine, int exit) {
        String sn = (inputLine.substring(exit + 1)).trim();
        return getNumberRomanOrArabic(sn);
    }


    static void romanToArabic(int arabic) {
        StringBuilder s = new StringBuilder();
        if (arabic > 0) {
            s.append("Result: ");
            int n = 0;
            while (arabic != n) {
                for (RomanNumbers ra : RomanNumbers.values()) {
                    if (arabic <= ra.getValue()) {
                        int index = ra.ordinal();
                        if (arabic < ra.getValue()) {
                            index = (ra.ordinal() - 1);
                        }
                        arabic -= RomanNumbers.values()[index].getValue();
                        s.append(RomanNumbers.values()[index].getKey());
                        break;
                    }
                }
            }
        }
        else {
            s.append("Roman numbers does not contain 0 and negative numbers\n" +
                             "Calculator exited with error.");
        }
        System.out.println(s);
    }


    static void calc(String inputLine, int num1, int num2, int exit) {
        if (num1 > 0 && num2 > 0 && num1 < 11 && num2 < 11) {
            switch (inputLine.charAt(exit)) {
                case '+':
                    if (rNum) {
                        romanToArabic(num1 + num2);
                        break;
                    }
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    if (rNum) {
                        romanToArabic(num1 - num2);
                        break;
                    }
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    if (rNum) {
                        romanToArabic(num1 * num2);
                        break;
                    }
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (rNum) {
                        romanToArabic(num1 / num2);
                        break;
                    }
                    System.out.println("Result: " + (num1 / num2));
                    break;
                default:
                    System.out.println(
                            "Calculator can't do math operations between arabic and roman numbers\n");
            }
        }
        else if (num1 == -1 && exit == 0) {
            missedOperator();
        }
        else {
            System.out.println("Please use numbers only from 1 to 10 or I to X");
        }
    }

}
