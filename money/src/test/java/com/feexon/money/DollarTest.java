package com.feexon.money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Administrator
 * @version 1.0 12-5-30,下午10:53
 */
public class DollarTest {
    @Test
    public void testAmount_afterMultiplication() throws Exception {
        Dollar fiveBucks = new Dollar(5);
        assertEquals("before multiplication", 5, fiveBucks.amount);
        fiveBucks.times(2);
        assertEquals("after multiplication", 5, fiveBucks.amount);
    }

    @Test
    public void testMultiplication() throws Exception {
        Dollar fiveBucks = new Dollar(5);
        fiveBucks.times(2);
        assertEquals(10, fiveBucks.amount);
    }
}
