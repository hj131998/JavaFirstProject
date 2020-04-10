package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenTest {
    private CheckEven app;
    
    @Before
    public void setup() {
        app = new CheckEven();
    }
    
    
    @Test
    public void testCheckEven() {
        //int count = app.countWords("this is a test");
        assertTrue(app.check(2) == true);
    }

    @Test
    public void testCheckEven1() {
        //int count = app.countWords("this is a test");
        assertTrue(app.check(4) == true);
    }

    @Test
    public void testCheckEven2() {
        //int count = app.countWords("this is a test");
        assertTrue(app.check(3) == false);
    }

   @Test
    public void testCheckEven3() {
        //int count = app.countWords("this is a test");
        assertTrue(app.check(8) == true);
    }

    @Test
    public void testCheckEven4() {
        //int count = app.countWords("this is a test");
        assertTrue(app.check(15) == false);
    }
}