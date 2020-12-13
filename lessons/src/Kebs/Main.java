package Kebs;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        //2. Mini calculator (reusing code from task 1)
        boolean repeat = true;
        while (repeat = true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter your FIRST chosen number");
                int firstNumber = Integer.parseInt(input.next());
                System.out.println("Enter your SECOND chosen number");
                int secondNumber = Integer.parseInt(input.next());

                System.out.println("Enter the ID of your desired action");
                System.out.println("1 - Multiplication* " + "\n" + "2 - Division/" + "\n" + "3 - Subtraction-" + "\n" + "4 - Sum+");
                int chosenAction = Integer.parseInt(input.next());
                //String chosenActionText = "none";
                int result = 0;

                if (chosenAction == 1) {
                    result = firstNumber * secondNumber;
                    //String chosenActionText = "multiplied";
                } else if (chosenAction == 2) {
                    result = firstNumber / secondNumber;
                    //String chosenActionText = "divided";
                } else if (chosenAction == 3) {
                    result = firstNumber - secondNumber;
                    //String chosenActionText = "minus";
                } else if (chosenAction == 4) {
                    result = firstNumber + secondNumber;
                    //String chosenActionText = "plus";
                }

        /*switch (chosenAction) {
            case 1:
                int chosenAction = 1;
            case 2:
                int chosenAction = 2;
                System.out.println("The result of " + firstNumber + ""  + " by " + secondNumber + " is ..." + "\n" + result);
                break;
            case 3:
                int chosenAction = 3;
            case 4:
                int chosenAction = 4;
                System.out.println("The result of " + firstNumber + ""  + "" + secondNumber + " is ..." + "\n" + result);
                break;
            default:
                break;
        }*/ System.out.println("The result of " + firstNumber + "" + " by " + secondNumber + " is ..." + "\n" + result);

                if (result == 69) {
                    System.out.println(ANSI_RED + "Nice! <3" + ANSI_RESET);
                } else if(result == 420) {
                    System.out.println(ANSI_RED + "( ͡❛ ͜ʖ ͡❛)" + ANSI_RESET);
                }

            // apacioje yra absoliuti krw nesamone
            System.out.println("Do you want to use mini calculator again?" + "\n" + "Enter any number if YES, enter 0 if NO");
            int bletpakeisk = Integer.parseInt(input.next());

            if (bletpakeisk > 0) {
                repeat = true;
            } else  {
                repeat = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter numbers only!");
                return;
            }
        }
    }
}
