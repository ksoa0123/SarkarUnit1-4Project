import java.util.Scanner;

public class Calculator {
    private int num1, num2;
    private String op;

    public Calculator(int num1, int num2, String op){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public Calculator(){ //Overloaded constructor, if user doesn't give any values 
        this.num1 = 5;
        this.num2 = 10;
        this.op = "+";
    }

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

    public double divide(){
        return (double) num1 / num2;
    }

    public int multiply(){
        return num1 * num2;
    }

    public int subtract(){
        return num1 - num2;
    }

    public double exponent(){
        return Math.pow(num1, num2);
    }

    public int addition(){
        return num1 + num2;
    }

    public int mod(){
        return num1 % num2;
    }

    public void guessingGame(int maxNum, int maxGuess){ //Max num is the highest number possible and the maxGuess is how many guesses you can make
        Scanner scan = new Scanner(System.in);
        // System.out.println(maxNum + " " + maxGuess);

        System.out.println("Enter in your guess: ");

        int userGuess = scan.nextInt();

        System.out.println(userGuess);

        int randomNum = (int) (Math.random() * maxNum); //Generates random number up to range maxNum

        int guessCount = 1; //Counting number of guesses

        while (userGuess != randomNum && guessCount < maxGuess){
           guessCount += 1;

           System.out.println("Sorry " + userGuess + " was not the correct guess.");

           System.out.println("Enter new guess: ");

           userGuess = scan.nextInt();
        }

        if (userGuess == randomNum && guessCount < maxGuess){
            System.out.println("Congrats you found the random number which was: " + Integer.toString(randomNum) + ". And you did it in " + Integer.toString(guessCount) + " guesses.");
        }
        else{
            System.out.println("Sorry you lost, you took " + guessCount + " guesses");
        }

    }


}
