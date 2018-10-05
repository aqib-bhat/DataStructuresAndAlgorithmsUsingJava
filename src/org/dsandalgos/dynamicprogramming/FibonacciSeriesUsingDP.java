package org.dsandalgos.misc;

import java.util.*;

public class FibonacciSeriesUsingDP {
	public static void main(String args[]) {
		FibonacciSeriesUsingDP fibonacciSeriesUsingDP = new FibonacciSeriesUsingDP();
		System.out.println("The 7th number in the Fibonacci series is: ");
		System.out.println(fibonacciSeriesUsingDP.fibUsingMemo(7));
		System.out.println("The first 10 numbers in the Fibonacci series are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacciSeriesUsingDP.fibUsingMemo(i) + ", ");
		}
	}

	// Map (memo) for storing the computed values.
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
}
