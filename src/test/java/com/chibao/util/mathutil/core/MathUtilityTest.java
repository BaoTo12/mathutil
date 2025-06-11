package com.chibao.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {


    @Test
    // biến mỗi test case thành test run, thành main()
    public void verifyFactorialGivenRightArg0RunsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    @Test
    void verifyFactorialGivenRightArg1RunsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    void verifyFactorialGivenRightArg2RunsWell() {
        assertEquals(2, MathUtility.getFactorial(2));
    }

    @Test
    public void verifyFactorialGivenRightArgsRunsWell() {
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }
}   










