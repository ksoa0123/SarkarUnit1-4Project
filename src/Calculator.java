import java.util.Scanner;

/**
 * The Calculator class represents a expression. A expression needs 2 numbers
 * and a operation
 */

public class Calculator {
    private int num1, num2;
    private String op;


    /**
     * Constructor for the Calculator class. This creates a new instance of a Calculator given
     * the below parameters.
     *
     * @param num1 represents the first number of the expression
     * @param num2 represents the second number of the expression
     * @param op represents the operation of the expression
     */

    public Calculator(int num1, int num2, String op){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }



    /**
     * The overloaded constructor. In case the user doesn't
     * enter any parameters to the Calculator class.
     * The default numbers are 5 and 10, respectively,
     * the operation is set to addition
     */

    public Calculator(){ //Overloaded constructor, if user doesn't give any values
        this.num1 = 5;
        this.num2 = 10;
        this.op = "+";
    }



    /**
     * calculate method for the Calculator class. This method will use
     * the appropiate helper method to find the
     * answer to the user's expression based on the
     * operation selected by the user.
     */


    public void calculate(){
        if (op.equals("/")){
            System.out.println("Expression Entered: " + num1 + " " +  op + " " +  num2 + " which is " + divide());
        }

        if (op.equals("*")){
            System.out.println("Expression Entered: " + num1 + " " +  op + " " +  num2 + " which is " + multiply());
        }

        if (op.equals("-")){
            System.out.println("Expression Entered: " + num1 + " " +  op + " " +  num2 + " which is " + subtract());
        }

        if (op.equals("^")){
            System.out.println("Expression Entered: " + num1 + " " +  op + " " +  num2 + " which is " + exponent());
        }


        if (op.equals("+")){
            System.out.println("Expression Entered: " + num1 + " " +  op + " " +  num2 + " which is " + addition());
        }

        if (op.equals("%")){
            System.out.println("Expression Entered: " + num1 + " " +  op + " " +  num2 + " which is " + mod());
        }
    }


    /**
     * divide method for the Calculator class. This method
     * will divide both numbers (making sure to use casting to avoid integer division)
     * and it will return the resulting value.
     *
     * @return returns a double which contains the first number divided by the second number
     */
    public double divide(){
        return roundNum((double) num1 / num2);
    }

    /**
     * multiply method for the Calculator class. This method
     * will multiply both numbers and
     * it will return the resulting value.
     *
     * @return returns a int which contains the first number multiplied by the second number
     */

    public int multiply(){
        return num1 * num2;
    }

    /**
     * subtract method for the Calculator class. This method
     * will subtract both numbers and
     * it will return the resulting value.
     *
     * @return returns a int which contains the first number subtracted by the second number
     */

    public int subtract(){
        return num1 - num2;
    }

    /**
     * exponent method for the Calculator class. This method
     * will raise the first number to the second number
     * it will return the resulting value.
     *
     * @return returns a double which contains the first number raised to the second number
     */

    public double exponent(){
        return Math.pow(num1, num2);
    }

    /**
     * addition method for the Calculator class. This method
     * will add both numbers and
     * it will return the resulting value.
     *
     * @return returns a int which contains the first number added by the second number
     */

    public int addition(){
        return num1 + num2;
    }

    /**
     * mod method for the Calculator class. This method
     * will mod the first number with the second number
     * it will return the resulting value.
     *
     * @return returns a int which contains the first number mod the second number
     */

    public int mod(){
        return num1 % num2;
    }


    public double roundNum(double a){
        return Math.round(a * 100.0) / 100.0;
    }

    /**
     * the guessingGame method will allow the user to play a guess number command line based game
     * where they can enter in a maximum number for the guess, which would represent the highest
     * number that the computer can choose in the range. And a maximum number of guesses which
     * would limit/ control the number of guesses the user can make.
     * @param maxNum an integer representing the maximum number the computer will choose from in its range
     * @param maxGuess an integer representing the maximum number of guesses the user can make
     *                 before they lose the game
     *
     */


    public void guessingGame(int maxNum, int maxGuess){ //Max num is the highest number possible and the maxGuess is how many guesses you can make
        Scanner scan = new Scanner(System.in);
        // System.out.println(maxNum + " " + maxGuess);

        System.out.println("Enter in your guess: ");

        int userGuess = scan.nextInt();

        System.out.println(userGuess);

        int randomNum = (int) (Math.random() * maxNum + 1); //Generates random number up to range maxNum

        int guessCount = 1; //Counting number of guesses

        while (userGuess != randomNum && guessCount < maxGuess){
           guessCount += 1;

           System.out.println("Sorry " + userGuess + " was not the correct guess.");

           if (userGuess > randomNum){
               System.out.println("Your number is too high");
           }

            if (userGuess < randomNum){
                System.out.println("Your number is too low");
            }

            System.out.println("Enter new guess: ");

           userGuess = scan.nextInt();
        }

        if (userGuess == randomNum && guessCount < maxGuess){
            System.out.println("Congrats you found the random number which was: " + Integer.toString(randomNum) + "\nAnd you did it in " + Integer.toString(guessCount) + " guesses.");
        }
        else{
            System.out.println("Sorry you lost, you took " + guessCount + " guesses" + ". The correct number was " + randomNum);
        }

    }


}
