package datastructuresandalgorithmsusingjava.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class FibonacciSeriesUsingDPTest {
    FibonacciSeriesUsingDP sut;
    
    public FibonacciSeriesUsingDPTest() {
        sut = new FibonacciSeriesUsingDP();
    }

    @Test
    void usingMemo7thNumberInFibonacciIsCalculated() {
        assertEquals(13, sut.fibUsingMemo(7));
    }

    @Test
    void usingBottomUpDPFirst15NumbersInFibonacciIsCalculated() {
        Map<Integer, Integer> result = sut.fibUsingBottomUpMemo(15);
        assertEquals(13, result.get(7));
		assertEquals(610, result.get(15));
    }
}
