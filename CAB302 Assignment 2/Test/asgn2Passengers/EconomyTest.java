/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asgn2Passengers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charles
 */
public class EconomyTest {
    
    public EconomyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testEconomy() throws PassengerException {
        int bookingTime = 0;
        int departureTime = 0;
        Economy instance = new Economy(bookingTime, departureTime);
        String string1 =  "Y:0";
        assertTrue("Economy testEconomy failed",string1.equals(instance.passID));
    }
    
    @Test
    public void testUpgrade() throws PassengerException {
        int bookingTime = 0;
        int departureTime = 0;
        Economy instance = new Economy(bookingTime, departureTime);
        assertTrue(instance.departureTime == departureTime);
        assertTrue(instance.departureTime == departureTime);
        assertTrue(instance.isNew());
        assertFalse(instance.isConfirmed());
        assertFalse(instance.isQueued());
        assertFalse(instance.isFlown());
        assertFalse(instance.isRefused());
        assertTrue(instance.getEnterQueueTime() == 0);
        assertTrue(instance.getExitQueueTime() == 0);
        assertTrue(instance.getConfirmationTime() == 0);
        assertTrue(instance.upgrade() instanceof Economy);
    }

}






