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
package liss;

import java.util.Date;
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
public class CalendarIT {
    
    public CalendarIT() {
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
     * Test of getDate method, of class Calendar.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Calendar instance = new Calendar();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Calendar.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Calendar instance = new Calendar();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayName method, of class Calendar.
     */
    @Test
    public void testGetDayName() {
        System.out.println("getDayName");
        Calendar instance = new Calendar();
        String expResult = "";
        String result = instance.getDayName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDayName method, of class Calendar.
     */
    @Test
    public void testSetDayName() {
        System.out.println("setDayName");
        String dayName = "";
        Calendar instance = new Calendar();
        instance.setDayName(dayName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayNumber method, of class Calendar.
     */
    @Test
    public void testGetDayNumber() {
        System.out.println("getDayNumber");
        Calendar instance = new Calendar();
        int expResult = 0;
        int result = instance.getDayNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDayNumber method, of class Calendar.
     */
    @Test
    public void testSetDayNumber() {
        System.out.println("setDayNumber");
        int dayNumber = 0;
        Calendar instance = new Calendar();
        instance.setDayNumber(dayNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRotation method, of class Calendar.
     */
    @Test
    public void testGetRotation() {
        System.out.println("getRotation");
        Calendar instance = new Calendar();
        int expResult = 0;
        int result = instance.getRotation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRotation method, of class Calendar.
     */
    @Test
    public void testSetRotation() {
        System.out.println("setRotation");
        int rotation = 0;
        Calendar instance = new Calendar();
        instance.setRotation(rotation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
