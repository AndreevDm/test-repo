package com.github.andreevdm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plus() {
        assertEquals(42, Calculator.sum(7, 424242));
    }
}
