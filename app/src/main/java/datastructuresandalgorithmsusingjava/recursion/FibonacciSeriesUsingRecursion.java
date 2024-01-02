package datastructuresandalgorithmsusingjava.recursion;

public class FibonacciSeriesUsingRecursion {

	/**
	 * Calculates the n-th number in the Fibonacci series using recursion.
	 * @param n the position of the number in the Fibonacci series that you want.
	 * @return the number in the Fibonacci series at the position you provided.
	 */
	public int fibonnaci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1){
			return 1;
		} else {
			return fibonnaci(n -1) + fibonnaci (n - 2);
		}
	}
}