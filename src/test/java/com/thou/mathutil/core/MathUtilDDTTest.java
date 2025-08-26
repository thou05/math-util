package com.thou.mathutil.core;

import com.sun.jdi.Value;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
    //JUNIT5
    static Stream<Arguments> initData() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24),
                Arguments.of(5, 120)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testGetFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}