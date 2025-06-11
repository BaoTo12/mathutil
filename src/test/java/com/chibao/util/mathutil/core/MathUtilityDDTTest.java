package com.chibao.util.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
class MathUtilityDDTTest {

    // DDT (data-driven testing) is also called parameterized
    // Data must be static
    // Data set is often 2-dimension arrays
    public static Object[][] initData(){
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}

        };
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}