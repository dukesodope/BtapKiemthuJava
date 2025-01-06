package com.example.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, mathUtils.add(-2, 1), "-2 + 1 should equal -1");
    }

    @Test
    void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-3, mathUtils.subtract(-2, 1), "-2 - 1 should equal -3");
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-2, mathUtils.multiply(-1, 2), "-1 * 2 should equal -2");
    }

    @Test
    void testDivide() {
        assertEquals(2, mathUtils.divide(6, 3), "6 / 3 should equal 2");
        assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(1, 0), "Division by zero should throw an exception");
    }
}
