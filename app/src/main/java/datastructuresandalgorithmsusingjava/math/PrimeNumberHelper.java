package datastructuresandalgorithmsusingjava.math;

import java.util.*;

/**
 * 
 */
public class PrimeNumberHelper {
   
    /**
     * Gets a list of the first n prime numbers.
     * @param n the number of the first primes you want.
     * @return a List of the first n prime numbers.
     */
    public List<Integer> getFirstNPrimeNumbers(int n) throws Exception {
        if (n < 1) {
            throw new Exception("You need to supply a positive number.");
        }

        List<Integer> firstNPrimes = new ArrayList<>();
        int currentPrime = 2;
        firstNPrimes.add(2);
        for (int index = 1; index < n; index++) {
            currentPrime = findNextPrime(currentPrime);
            firstNPrimes.add(currentPrime);
        }
        return firstNPrimes;
    }

    private int findNextPrime(int currentPrime) {
        currentPrime = currentPrime + 1;
        while (!PrimeNumberHelper.isPrime(currentPrime)) {
            currentPrime += 1;
        }
        return currentPrime;
    }

    /**
     * Checks whether a given number is prime or not.
     * @param n the given integer.
     * @return 'true' if the given number is prime.
     */
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n < 2) {
            return false;
        }

        int divisor = n / 2;
        while (divisor > 1) {
            if (n % divisor == 0) {
                return false;
            }
            divisor -= 1;
        }
        return true;
    }
}
