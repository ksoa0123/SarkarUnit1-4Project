import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\\ Hello welcome to the Mathbot :)  /");

        System.out.println("Enter your expression: ");

        String expression = scan.nextLine();

        int num1 = Integer.parseInt(expression.substring(0, expression.indexOf(" ")));

        int num2 = Integer.parseInt(expression.substring(expression.indexOf(" ") + 3));

        String op = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);

        System.out.println("Expression Entered: " + num1 + " " +  op + " " +  num2);

        Calculator app = new Calculator(num1, num2, op);

        app.calculate();

        System.out.println("Would you like to play the guessing game with Mathbot?");

        String reply = scan.nextLine();

        if (reply.toLowerCase().equals("y") || reply.toLowerCase().equals("yes")){
            System.out.println("Enter the maximum number for the range you would like: ");

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
