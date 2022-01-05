package com.example.gittest;

class Calculator {


    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }


    public static void main(String args[]) {


        Calculator calculator = new Calculator();
        int result0 = calculator.addAToB(2, 3);
        int result1 = calculator.substractAFromB(10, 6);

        System.out.println("the sum of a and b is " + result0 + " and subtract a from b is " + result1);
    }
}


