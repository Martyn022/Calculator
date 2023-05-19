package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntsCalculator {
    Ints intTestCalc = new IntsCalculator();

    @Test
    void sum() {
        int actual = intTestCalc.sum(10, 8);
        int expected = 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sub() {
        int actual = intTestCalc.sub(20, 10);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void mult() {
        int actual = intTestCalc.mult(5, 8);
        int expected = 40;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void div() {
        int actual = intTestCalc.div(44, 4);
        int expected = 11;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pow() {
        int actual = intTestCalc.pow(5, 2);
        int expected = 25;
        Assertions.assertEquals(expected, actual);
    }

}
