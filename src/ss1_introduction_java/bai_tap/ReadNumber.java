package ss1_introduction_java.bai_tap;

import java.util.Objects;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to turn it into words");
        num = Integer.parseInt(sc.nextLine());
        String numToString = Integer.toString(num);

        if (num >= 0 && num <= 9) {
            System.out.println(from0To9(numToString));
        } else if (num <= 19) {
            System.out.println(from10To19(numToString));
        } else if (num <= 99) {
            System.out.println(from20To99(numToString));
        } else if (num <= 999) {
            System.out.println(from100To999(numToString));
        } else System.out.println("Out of ability!!");

    }

    public static String from0To9(String string) {

        switch (string) {
            case "0": return "zero";
            case "1": return "one";
            case "2": return "two";
            case "3": return "three";
            case "4": return "four";
            case "5": return "five";
            case "6": return "six";
            case "7": return "seven";
            case "8": return "eight";
            case "9": return "nine";
            default: return "NaN";

        }
    }

    public static String from10To19(String string) {
        if (string.equals("10")) return "ten";

        String secondNum = String.valueOf(string.charAt(1));
        switch (secondNum) {
            case "1": return "eleven";
            case "2": return "twelve";
            case "3": return "thirteen";
            case "5": return "fifteen";
            default: return from0To9(secondNum) + "teen";
        }
    }

    public static String from20To99(String string) {
        String result = "";
        String firstNum = String.valueOf(string.charAt(0));
        String secondNum = String.valueOf(string.charAt(1));

        switch (firstNum) {
            case "2": result += "twen";break;
            case "3": result += "thir";break;
            case "5": result += "fif";break;
            default: result += from0To9(firstNum);
        }
        if (secondNum.equals("0")) return result + "ty";
        else return result + ("ty " + from0To9(secondNum));
    }

    public static String from100To999(String string) {
        String result = "";

        String firstNum = String.valueOf(string.charAt(0));
        String secondNum = String.valueOf(string.charAt(1));
        String thirdNum = String.valueOf(string.charAt(2));
        String secondAndThird = secondNum + thirdNum;
        int secondAndThirdToInt = Integer.parseInt(secondAndThird);
        result += from0To9(firstNum) + " hundred";

        if (secondAndThirdToInt == 0) result += "";
        else if (secondAndThirdToInt <= 9) result += " and " + from0To9(thirdNum);
        else if (secondAndThirdToInt <= 19) result += " and " + from10To19(secondAndThird);
        else result += " and " + from20To99(secondAndThird);

        return result;
    }
}
