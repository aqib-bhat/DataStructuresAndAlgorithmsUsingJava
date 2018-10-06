package org.dsandalgos.misc;

import java.util.*;

public class FibonacciSeriesUsingDP {
	public static void main(String args[]) {
		FibonacciSeriesUsingDP fibonacciSeriesUsingDP = new FibonacciSeriesUsingDP();
		System.out.println("The 7th number in the Fibonacci series is: ");
		System.out.println(fibonacciSeriesUsingDP.fibUsingMemo(7));
		System.out.println("\nThe first 10 numbers in the Fibonacci series are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacciSeriesUsingDP.fibUsingMemo(i) + ", ");
		}
		System.out.println("\n\nNow using the bottom-up approach...");
		System.out.println("The first 15 numbers in the Fibonacci series are: ");
		fibonacciSeriesUsingDP.fibUsingBottomUpMemo(15).entrySet()
		    .forEach(e -> System.out.print(e.getValue() + ", "));
	}

	// Map (memo) for storing the computed values (top-down approach).
	private HashMap<Integer, Integer> fibonacciMemo = new HashMap<>();
	
	FibonacciSeriesUsingDP() {
	    fibonacciMemo.put(0,0);
	    fibonacciMemo.put(1,1);
	}

	/*
	 * Method for calculating the Fibonacci series numbers following a
	 * memo-ized approach.
	 * @param n The position for which we want to calculate the value in the Fibonacci series.
	 * @return The value at the given position in the Fibonacci series.
	*/	
	private int fibUsingMemo (int n) {
		int fib = 0;
		
		if (n < 2) {
			fib = n;
		} else {
			if (fibonacciMemo.containsKey(n-1)) {
				fib += fibonacciMemo.get(n-1);
			} else {
				// Defensive coding, in case this method was not called sequentially for arg from 0 to n-1.
				fib += fibUsingMemo(n-1);
			}
			fib += fibonacciMemo.get(n-2);
			fibonacciMemo.put(n, fib);
		}
		return fib;
	}

	/*
	 * Method for calculating the Fibonacci series numbers following a
	 * bottom-up approach.
	 * @param n The position up to which we want to calculate the values in the Fibonacci series.
	 * @return A map containing the values of the first n numbers in the Fibonacci series.
	*/		
	private HashMap<Integer, Integer> fibUsingBottomUpMemo(int n) {
		HashMap<Integer, Integer> fibBottomUpMemo = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (i < 2) {
				fibBottomUpMemo.put(i, i);
			} else {
				fibBottomUpMemo.put(i, fibBottomUpMemo.get(i - 1) + fibBottomUpMemo.get(i - 2));
			}
		}
		return fibBottomUpMemo;
	}
}
