package datastructuresandalgorithmsusingjava.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSeriesUsingRecursionTest {
    FibonacciSeriesUsingRecursion sut;
    
    public FibonacciSeriesUsingRecursionTest() {
        sut = new FibonacciSeriesUsingRecursion();
    }

    @Test
    void usingRecursion7thNumberInFibonacciIsCalculated() {
        assertEquals(13, sut.fibonnaci(7));
    }

    @Test
    void usingRecursion15thNumberInFibonacciIsCalculated() {
        assertEquals(610, sut.fibonnaci(15));
    }
}
