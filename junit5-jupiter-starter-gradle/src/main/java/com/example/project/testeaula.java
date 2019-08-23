package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.*;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
		assertEquals(-6, calculator.add(-3, -3));
		assertEquals(2.5, calculator.add(1.1, 1.4));
		assertEquals(0, calculator.add(-1, 1));
		assertEquals("i", calculator.add(2,1));
    }

	 @Test
    void sub() {
        assertEquals(0, calculator.sub(1, 1));
		assertEquals(-4, calculator.sub(-2, -2));
		assertEquals(3.4, calculator.sub(5.5, 2.1));
		assertEquals("n", calculator.sub(1, 6));
    }
	
	 @Test
    void mult() {
        assertEquals(10, calculator.mult(5, 2));
		assertEquals(-100, calculator.mult(-10, -10));
		assertEquals(5.85, calculator.mult(4.5, 1.3));
		assertEquals("n", calculator.mult(5, 1));
		assertEquals(0, calculator.mult(1, 0));
    }
	
	 @Test
    void div() {
        assertEquals(1, calculator.div(1, 1));
		assertEquals(-10, calculator.div(-20, 2));
		assertEquals(1.75, calculator.div(3.5, 2));
		assertEquals("k", calculator.div(5, 1));
		assertEquals(0, calculator.div(0, 6));
    }
}