package org.dsandalgos.misc;

public class FibonacciSeriesUsingRecursion {
	public static void main(String args[]) {
		FibonacciSeriesUsingRecursion fibonacciSeriesUsingRecursion = new FibonacciSeriesUsingRecursion();
		System.out.println("The first 10 numbers in the Fibonacci series are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacciSeriesUsingRecursion.fibonnaci(i) + ", ");
		}
	}

	private int fibonnaci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1){
			return 1;
		} else {
			return fibonnaci(n -1) + fibonnaci (n - 2);
		}
	}
}