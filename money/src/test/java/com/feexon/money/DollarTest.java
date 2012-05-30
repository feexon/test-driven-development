package com.feexon.money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Administrator
 * @version 1.0 12-5-30,下午10:53
 */
public class DollarTest {
    @Test
    public void testMultiplication() throws Exception {
        Dollar fiveBucks = new Dollar(5);
        fiveBucks.times(2);
        assertEquals(10, fiveBucks.amount);
    }
}
