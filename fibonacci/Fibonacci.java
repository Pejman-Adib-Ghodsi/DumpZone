package com.example.fibonacci;

public class Fibonacci {

    public static void calculateFibonacciSeriesOf(int number){
        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + ", " + n2);
        for(int i=2; i<number; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", " + n3);
        }
    }

    public static void main(String[] args) {
        Fibonacci.calculateFibonacciSeriesOf(10);
    }

}
