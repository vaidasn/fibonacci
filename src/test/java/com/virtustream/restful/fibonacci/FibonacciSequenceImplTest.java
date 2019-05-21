package com.virtustream.restful.fibonacci;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class FibonacciSequenceImplTest {

    private static final FibonacciSequenceImpl fibonacciSequence = new FibonacciSequenceImpl();

    @Test
    public void testGenerateSeriesNegative() {
        List<Integer> sequence = fibonacciSequence.generate(-1);
        assertEquals(Collections.emptyList(), sequence);
    }

    @Test
    public void testGenerateSeries0() {
        List<Integer> sequence = fibonacciSequence.generate(0);
        assertEquals(Collections.emptyList(), sequence);
    }

    @Test
    public void testGenerateSeries1() {
        List<Integer> sequence = fibonacciSequence.generate(1);
        assertEquals(Arrays.asList(0), sequence);
    }

    @Test
    public void testGenerateSeries2() {
        List<Integer> sequence = fibonacciSequence.generate(2);
        assertEquals(Arrays.asList(0, 1), sequence);
    }

    @Test
    public void testGenerateSeries3() {
        List<Integer> sequence = fibonacciSequence.generate(3);
        assertEquals(Arrays.asList(0, 1, 1), sequence);
    }

    @Test
    public void testGenerateSeries4() {
        List<Integer> sequence = fibonacciSequence.generate(4);
        assertEquals(Arrays.asList(0, 1, 1, 2), sequence);
    }

    @Test
    public void testGenerateSeries5() {
        List<Integer> sequence = fibonacciSequence.generate(5);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3), sequence);
    }

    @Test
    public void testGenerateSeries6() {
        List<Integer> sequence = fibonacciSequence.generate(6);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), sequence);
    }

    @Test
    public void testGenerateSeries7() {
        List<Integer> sequence = fibonacciSequence.generate(7);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), sequence);
    }

    @Test
    public void testGenerateSeries8() {
        List<Integer> sequence = fibonacciSequence.generate(8);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), sequence);
    }

    @Test
    public void testGenerateSeries9() {
        List<Integer> sequence = fibonacciSequence.generate(9);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21), sequence);
    }

    @Test
    public void testGenerateSeries10() {
        List<Integer> sequence = fibonacciSequence.generate(10);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), sequence);
    }

    @Test
    public void testGenerateSeries11() {
        List<Integer> sequence = fibonacciSequence.generate(11);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55), sequence);
    }

    @Test
    public void testGenerateSeries12() {
        List<Integer> sequence = fibonacciSequence.generate(12);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89), sequence);
    }

    @Test
    public void testGenerateSeries13() {
        List<Integer> sequence = fibonacciSequence.generate(13);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144), sequence);
    }

    @Test
    public void testGenerateSeries14() {
        List<Integer> sequence = fibonacciSequence.generate(14);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233), sequence);
    }

    @Test
    public void testGenerateSeries15() {
        List<Integer> sequence = fibonacciSequence.generate(15);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377), sequence);
    }

}
