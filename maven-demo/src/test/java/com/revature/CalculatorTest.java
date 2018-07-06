package com.revature;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.*;

public class CalculatorTest {
    Calculator c;
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("This runs once, before test class");
    }

    @Before
    public final void bootstrap() {
        System.out.println("Running before each method");
        c = new Calculator();
    }

    @After
    public final void after() {
        System.out.println("This is after each method");
    }

    @Test
    public final void twoNumbersReturnSum() {
        int sum = c.sum("1,2");
        assertEquals(3, sum);
    }

    @Test(expected = RuntimeException.class)
    public final void moreThanTwoNumbers() {
        c.sum("1,2,3");
    }

    @Test
    public final void emptyInputIsZero() {
        assertEquals(0, c.sum(""));
    }
}