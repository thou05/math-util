package com.thou.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n){
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. Must be in range [0..20]");
        }

        if(n == 0 || n == 1){
            return 1;
        }

        return n * getFactorial(n - 1);
    }

    //ctrl + shift + t de chon test

}
