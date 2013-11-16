package com.examples;

public class FibonacciSeries {

	public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int N = 5;
        for(int i=0;i<=N;i++){
        	System.out.println(i + "  " + fib(i));
        }
    }
    
    
}
