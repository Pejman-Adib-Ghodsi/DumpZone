package com.example.fibonacci;

public class FibonacciRecursive {

    static int n1 = 0, n2 = 1, n3;

    public static void calculateFibonacci(int number) {
        if(number > 0) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", " + n3);
            calculateFibonacci(number-1);
        }
    }

    public static void main(String[] args) {
        int number = 10;

        System.out.print(n1 + ", " + n2);

        calculateFibonacci(number-2);
    }

}
