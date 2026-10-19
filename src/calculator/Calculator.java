package calculator;

public class Calculator {

    public void add(int a, int b){
        int result = a+b;

        System.out.println("Addition: " + result);
    }

    public void mul(int a, int b){
        int result = a*b;

        System.out.println("Multiplication: " + result);
    }

    public void div(int a, int b){
        int result = a/b;

        System.out.println("Divide: " + result);
    }

    public void sub(int a, int b){
        int result = a-b;
    }
}
