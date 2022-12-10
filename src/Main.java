import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /**
         * Mathbot is a basic app where you can collect user inputted expression
         * so you can find its value
         */


        System.out.println("\\ Hello welcome to Mathbot :)  /");

        System.out.println("Enter your expression (Format: 5 + 3, 10 * 3 etc.): ");

        String expression = scan.nextLine();

        int num1 = Integer.parseInt(expression.substring(0, expression.indexOf(" "))); //Extracts the first number, operation, and second number via using substring to manipulate the user's string

        int num2 = Integer.parseInt(expression.substring(expression.indexOf(" ") + 3));

        String op = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);


        Calculator app = new Calculator(num1, num2, op);

        app.calculate();

        Calculator app2 = new Calculator(); //Overloaded constructor

        app2.calculate();


        /**
         * The guessing game is a feature of the Mathbot where you can choose a maximum value
         * , the computer will choose a value within that range and you pick how many guesses
         * you want to have. If you can pick the correct number within the number of guesses
         * you win
         */


        System.out.println("Would you like to play the guessing game with Mathbot (yes/no) ?");

        String reply = scan.nextLine();

        if (reply.toLowerCase().equals("y") || reply.toLowerCase().equals("yes")){
            System.out.println("Enter the maximum number for the range you would like (Number can be between 1 and number entered inclusive): ");

            int userNum = scan.nextInt();

            System.out.println("Enter the maximum guesses you would like: ");

            int userGuess = scan.nextInt();

            app.guessingGame(userNum, userGuess);
        }

        else{ //If user says no
            System.out.println("Thank you for using Mathbot!");
        }


    }
}
