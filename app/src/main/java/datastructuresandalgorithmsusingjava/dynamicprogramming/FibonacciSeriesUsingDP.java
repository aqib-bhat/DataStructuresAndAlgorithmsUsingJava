package datastructuresandalgorithmsusingjava.dynamicprogramming;

import java.util.*;

public class FibonacciSeriesUsingDP {
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
	public int fibUsingMemo (int n) {
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
	public HashMap<Integer, Integer> fibUsingBottomUpMemo(int n) {
		HashMap<Integer, Integer> fibBottomUpMemo = new HashMap<>();
		for (int i = 0; i <= n; i++) {
			if (i < 2) {
				fibBottomUpMemo.put(i, i);
			} else {
				fibBottomUpMemo.put(i, fibBottomUpMemo.get(i - 1) + fibBottomUpMemo.get(i - 2));
			}
		}
		return fibBottomUpMemo;
	}
}
