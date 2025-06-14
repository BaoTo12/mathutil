package com.chibao.util.mathutil.core;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    public void verifyFactorialGivenRightArg0RunsWell(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
}
