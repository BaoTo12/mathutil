package com.chibao.util;

import com.chibao.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // technique for typing code while also typing test case and test run called TDD
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArgsRunsWell();


    }
    // TEST CASE #2: Verify the getFactorial() with n = 0;
    public static void verifyFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);

        System.out.println("0! = expected: " + expected + ",actual: " + actual);
    }

    // TEST CASE #2: Verify the getFactorial() with n = 1;
    public static void verifyFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);

        System.out.println("1! = expected: " + expected + ",actual: " + actual);
    }

    // TEST CASE #3: Verify the getFactorial() with n = 2;
    public static void verifyFactorialGivenRightArg2RunsWell() {
        int n = 2;
        long expected = 2;

        System.out.println("2! = expected: " + expected + ",actual: " + MathUtility.getFactorial(n));
    }

    // TEST CASE #4: Verify the getFactorial() with n = 3, 4, 5, 6....;
    public static void verifyFactorialGivenRightArgsRunsWell() {
        System.out.println("3! = expected: " + 6 + ", actual: " + MathUtility.getFactorial(3));
        System.out.println("4! = expected: " + 24 + ", actual: " + MathUtility.getFactorial(4));
        System.out.println("5! = expected: " + 120 + ", actual: " + MathUtility.getFactorial(5));
        System.out.println("6! = expected: " + 720 + ", actual: " + MathUtility.getFactorial(6));
    }
}