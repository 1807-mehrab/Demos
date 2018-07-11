package com.revature;

public class Calculator {
    public int sum(String expression) {
        int sum = 0;
        expression = expression.replaceAll("\\s+", "");
        String[] numbersArray = expression.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Please help me");
        } else { 
            for (String n : numbersArray) {
                if (!n.equals("")) {
                    sum += Integer.parseInt(n);
                } else {
                    continue;
                }
            }
        }
        return sum;
    }
}