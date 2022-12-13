package com.example.madt20221005;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    @Test
    public void charCountCorrect1() {
        String input = "hmodm";
        String actual = TextCounter.getCharsCount(input);
        String expected = "5";
        assertEquals(expected, actual);
    }

    @Test
    public void charCountCorrect2() {
        String input = "hmo nj";
        String actual = TextCounter.getCharsCount(input);
        String expected = "6";
        assertEquals(expected, actual);
    }
    @Test
    public void charCountCorrect3() {
        String input = "hmo 02k ";
        String actual = TextCounter.getCharsCount(input);
        String expected = "8";
        assertEquals(expected, actual);
    }

    @Test
    public void wordCountCorrect1() {
        String input = "hmodm";
        int actual = TextCounter.countWordsUsingSplit(input);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void wordCountCorrect2() {
        String input = "hmod 1";
        int actual = TextCounter.countWordsUsingSplit(input);
        int expected = 2;
        assertEquals(expected, actual);
    }

}