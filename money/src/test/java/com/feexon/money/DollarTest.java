package com.feexon.money;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Administrator
 * @version 1.0 12-5-30,下午10:53
 */
public class DollarTest {

    private Dollar fiveBucks;

    @Before
    public void setUp() throws Exception {
        fiveBucks = new Dollar(5);
    }

    @Test
    public void testAmount_afterMultiplication() throws Exception {
        assertEquals("before multiplication", 5, fiveBucks.amount);
        fiveBucks.times(2);
        assertEquals("after multiplication", 5, fiveBucks.amount);
    }

    @Test
    public void testMultiplication() throws Exception {
        Dollar tenBucks=fiveBucks.times(2);
        assertEquals(10, tenBucks.amount);
    }


}
