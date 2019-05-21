package com.virtustream.restful.fibonacci;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class FibonacciSequenceImplTest {

    private static final FibonacciSequenceImpl fibonacciSequence = new FibonacciSequenceImpl();

    @Test
    public void testGenerateSeriesNegative() {
        List<BigInteger> sequence = fibonacciSequence.generate(-1);
        assertEquals(Collections.emptyList(), sequence);
    }

    @Test
    public void testGenerateSeries0() {
        List<BigInteger> sequence = fibonacciSequence.generate(0);
        assertEquals(Collections.emptyList(), sequence);
    }

    @Test
    public void testGenerateSeries1() {
        List<BigInteger> sequence = fibonacciSequence.generate(1);
        assertEquals(Arrays.asList(bi(0)), sequence);
    }

    @Test
    public void testGenerateSeries2() {
        List<BigInteger> sequence = fibonacciSequence.generate(2);
        assertEquals(Arrays.asList(bi(0), bi(1)), sequence);
    }

    @Test
    public void testGenerateSeries3() {
        List<BigInteger> sequence = fibonacciSequence.generate(3);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1)), sequence);
    }

    @Test
    public void testGenerateSeries4() {
        List<BigInteger> sequence = fibonacciSequence.generate(4);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2)), sequence);
    }

    @Test
    public void testGenerateSeries5() {
        List<BigInteger> sequence = fibonacciSequence.generate(5);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3)), sequence);
    }

    @Test
    public void testGenerateSeries6() {
        List<BigInteger> sequence = fibonacciSequence.generate(6);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5)), sequence);
    }

    @Test
    public void testGenerateSeries7() {
        List<BigInteger> sequence = fibonacciSequence.generate(7);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8)), sequence);
    }

    @Test
    public void testGenerateSeries8() {
        List<BigInteger> sequence = fibonacciSequence.generate(8);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13)), sequence);
    }

    @Test
    public void testGenerateSeries9() {
        List<BigInteger> sequence = fibonacciSequence.generate(9);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13), bi(21)), sequence);
    }

    @Test
    public void testGenerateSeries10() {
        List<BigInteger> sequence = fibonacciSequence.generate(10);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13), bi(21), bi(34)), sequence);
    }

    @Test
    public void testGenerateSeries11() {
        List<BigInteger> sequence = fibonacciSequence.generate(11);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13), bi(21), bi(34), bi(55)), sequence);
    }

    @Test
    public void testGenerateSeries12() {
        List<BigInteger> sequence = fibonacciSequence.generate(12);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13), bi(21), bi(34), bi(55), bi(89)), sequence);
    }

    @Test
    public void testGenerateSeries13() {
        List<BigInteger> sequence = fibonacciSequence.generate(13);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13), bi(21), bi(34), bi(55), bi(89), bi(144)), sequence);
    }

    @Test
    public void testGenerateSeries14() {
        List<BigInteger> sequence = fibonacciSequence.generate(14);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13), bi(21), bi(34), bi(55), bi(89), bi(144), bi(233)), sequence);
    }

    @Test
    public void testGenerateSeries15() {
        List<BigInteger> sequence = fibonacciSequence.generate(15);
        assertEquals(Arrays.asList(bi(0), bi(1), bi(1), bi(2), bi(3), bi(5), bi(8), bi(13), bi(21), bi(34), bi(55), bi(89), bi(144), bi(233), bi(377)), sequence);
    }

    private static BigInteger bi(int i) {
        return BigInteger.valueOf(i);
    }

}
