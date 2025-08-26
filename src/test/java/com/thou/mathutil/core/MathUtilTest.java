package com.thou.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);

        assertEquals(expected, actual);

        assertEquals(1, MathUtil.getFactorial(1)); // 1! = 1
        assertEquals(2,  MathUtil.getFactorial(2));
        assertEquals(6,  MathUtil.getFactorial(3));
        assertEquals(24,  MathUtil.getFactorial(4));
        assertEquals(120,  MathUtil.getFactorial(5));
        assertEquals(720,  MathUtil.getFactorial(6));
    }


    @Test
    public void getFactorialGivenWrongArgumentThrowsException() {
        //assetThrows(tham so 1: loai ngoai le muon so sanh, tham so 2: doan code chay vang ra ngoai runnable
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(21));
    }

    @Test
    public void getFactorialGivenWrongArgumentThrowsException_TryCatch(){
        try{
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            assertEquals("Invalid n. Must be in range [0..20]", e.getMessage());
        }
    }
}