package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by VPa on 11/18/2015.
 */

public class MyFirstTest {
    @Test
    public	void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);
    }
}
