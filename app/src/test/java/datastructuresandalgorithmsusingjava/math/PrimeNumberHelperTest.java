package datastructuresandalgorithmsusingjava.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class PrimeNumberHelperTest {
    PrimeNumberHelper sut;

    PrimeNumberHelperTest() {
        sut = new PrimeNumberHelper();
    }

    @Test
    public void getFirstThreePrimesInReverse() throws Exception {
        List<Integer> result = sut.getFirstNPrimeNumbers(3);
        assertEquals(3, result.size());
        List<Integer> expectedList = Arrays.asList(2, 3, 5);
        assertEquals(expectedList, result);
    }

    @Test
    public void getFirstFivePrimesInReverse() throws Exception {
        List<Integer> result = sut.getFirstNPrimeNumbers(5);
        assertEquals(5, result.size());
        List<Integer> expectedList = Arrays.asList(2, 3, 5, 7, 11);
        assertEquals(expectedList, result);
    }
}
