package com.revature.math;

public class Calculator {
    private int a;
    private int b;
    private char operation;

    public int sum() {
        return a + b;
    }

    public int diff() {
        return a - b;
    }

    public Calculator() {}

    public Calculator(int a, int b, char operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate() {
        switch(operation) {
            case '+': System.out.println( sum() ); break;
            case '-': System.out.println( diff() ); break;
        }
    }
}