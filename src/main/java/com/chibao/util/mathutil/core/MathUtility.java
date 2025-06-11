package com.chibao.util.mathutil.core;

public class MathUtility {

    // this class is used for stimulating Math functions that will copy functions from Math JDK
    // 1.2.3.4.5.n
    // 0! = 1
    // 20! is enough value for long data type
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 and 20");

        if (n == 0 || n == 1) return 1;

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
