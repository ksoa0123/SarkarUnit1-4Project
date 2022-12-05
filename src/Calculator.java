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


}
