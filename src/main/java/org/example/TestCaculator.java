package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCaculator {

    @Test
    public void testgetYearOfBirth() {
        Calculator myYearOfBirth = new Calculator();

        String result = myYearOfBirth.getYearOfBirth("Hema", "36");
        assertEquals("Hi Hema, your year of birth is 1988.", result);

        String result1 = myYearOfBirth.getYearOfBirth("Hema", "0");
        assertEquals("Hi Hema, your year of birth is 2024.", result1);

        String result2 = myYearOfBirth.getYearOfBirth("Hema", "abc");
        assertEquals("Invalid age", result2);

        String result3 = myYearOfBirth.getYearOfBirth("Hema", "-31");
        assertEquals("Invalid age", result3);

        String result4 = myYearOfBirth.getYearOfBirth("Hema", "31.5");
        assertEquals("Invalid age", result4);

        String result5 = myYearOfBirth.getYearOfBirth("Hema", " ");
        assertEquals("Invalid age", result5);

    }

    @Test
    public void testgreetings() {
        Calculator output = new Calculator();

        String result = output.greetings("Vidyuth", "2010",13);
        assertEquals("Hi Vidyuth, your year of birth is 2010.", result);

        String result1 = output.greetings("Vidyuth", "2010",-13);
        assertEquals("Invalid error", result1);
    }

}

