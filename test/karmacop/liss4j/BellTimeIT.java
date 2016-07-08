/*
 * Copyright (C) 2016 MHS.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package karmacop.liss4j;

import karmacop.liss4j.BellTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MHS
 */
public class BellTimeIT {
    
    public BellTimeIT() {
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

    /**
     * Test of setDayNumber method, of class BellTime.
     */
    @Test
    public void testSetDayNumber() {
        System.out.println("setDayNumber");
        int dayNumber = 0;
        BellTime instance = new BellTime();
        instance.setDayNumber(dayNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayNumber method, of class BellTime.
     */
    @Test
    public void testGetDayNumber() {
        System.out.println("getDayNumber");
        BellTime instance = new BellTime();
        int expResult = 0;
        int result = instance.getDayNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDayName method, of class BellTime.
     */
    @Test
    public void testSetDayName() {
        System.out.println("setDayName");
        String dayName = "";
        BellTime instance = new BellTime();
        instance.setDayName(dayName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayName method, of class BellTime.
     */
    @Test
    public void testGetDayName() {
        System.out.println("getDayName");
        BellTime instance = new BellTime();
        String expResult = "";
        String result = instance.getDayName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeriod method, of class BellTime.
     */
    @Test
    public void testSetPeriod() {
        System.out.println("setPeriod");
        String string = "";
        BellTime instance = new BellTime();
        instance.setPeriod(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeriod method, of class BellTime.
     */
    @Test
    public void testGetPeriod() {
        System.out.println("getPeriod");
        BellTime instance = new BellTime();
        String expResult = "";
        String result = instance.getPeriod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartTime method, of class BellTime.
     */
    @Test
    public void testSetStartTime() {
        System.out.println("setStartTime");
        String string = "";
        BellTime instance = new BellTime();
        instance.setStartTime(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartTime method, of class BellTime.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        BellTime instance = new BellTime();
        String expResult = "";
        String result = instance.getStartTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndTime method, of class BellTime.
     */
    @Test
    public void testSetEndTime() {
        System.out.println("setEndTime");
        String string = "";
        BellTime instance = new BellTime();
        instance.setEndTime(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTime method, of class BellTime.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        BellTime instance = new BellTime();
        String expResult = "";
        String result = instance.getEndTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class BellTime.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String string = "";
        BellTime instance = new BellTime();
        instance.setType(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class BellTime.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        BellTime instance = new BellTime();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
