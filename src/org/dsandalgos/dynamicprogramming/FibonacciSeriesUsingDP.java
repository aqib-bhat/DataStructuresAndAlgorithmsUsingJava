package org.dsandalgos.misc;

import java.util.*;

public class FibonacciSeriesUsingDP {
	public static void main(String args[]) {
		FibonacciSeriesUsingDP fibonacciSeriesUsingDP = new FibonacciSeriesUsingDP();
		System.out.println("The first 10 numbers in the Fibonacci series are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacciSeriesUsingDP.memoFib(i) + ", ");
		}
	}

	// Map (memo) for storing the computed values.
	private HashMap<Integer, Integer> fibonacciMemo = new HashMap<>();

	/*
	 * Method for calculating the Fibonacci series numbers following a
	 * memo-ized approach.
	 * @param n The position for which we want to calculate the value in the Fibonacci series.
	 * @return The value at the given position in the Fibonacci series.
	*/	
	private int memoFib (int n) {
		int fib;
		if (n == 0) {
			fib = 0;
		} else if (n < 2) {
			fib = 1;
		} else {
			fib = fibonacciMemo.get(n-1) + fibonacciMemo.get(n-2);
		}
		fibonacciMemo.put(n, fib);
		return fib;
	}
}
