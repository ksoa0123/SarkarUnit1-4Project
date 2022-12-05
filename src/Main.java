import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your expression: ");

        String expression = scan.nextLine();

        int num1 = Integer.parseInt(expression.substring(0,1));

        int num2 = Integer.parseInt(expression.substring(expression.indexOf(" ") + 3));

        String op = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);

        Calculator app = new Calculator(num1, num2, op);


    }
}
