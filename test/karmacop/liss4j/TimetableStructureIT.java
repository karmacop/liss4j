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

import karmacop.liss4j.TimetableStructure;
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
public class TimetableStructureIT {
    
    public TimetableStructureIT() {
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
     * Test of setTtStructure method, of class TimetableStructure.
     */
    @Test
    public void testSetTtStructure() {
        System.out.println("setTtStructure");
        String ttStructure = "";
        TimetableStructure instance = new TimetableStructure();
        instance.setTtStructure(ttStructure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTtStructure method, of class TimetableStructure.
     */
    @Test
    public void testGetTtStructure() {
        System.out.println("getTtStructure");
        TimetableStructure instance = new TimetableStructure();
        String expResult = "";
        String result = instance.getTtStructure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcademicYear method, of class TimetableStructure.
     */
    @Test
    public void testSetAcademicYear() {
        System.out.println("setAcademicYear");
        String academicYear = "";
        TimetableStructure instance = new TimetableStructure();
        instance.setAcademicYear(academicYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcademicYear method, of class TimetableStructure.
     */
    @Test
    public void testGetAcademicYear() {
        System.out.println("getAcademicYear");
        TimetableStructure instance = new TimetableStructure();
        int expResult = 0;
        int result = instance.getAcademicYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerms method, of class TimetableStructure.
     */
    @Test
    public void testSetTerms() {
        System.out.println("setTerms");
        String terms = "";
        TimetableStructure instance = new TimetableStructure();
        instance.setTerms(terms);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTerms method, of class TimetableStructure.
     */
    @Test
    public void testGetTerms() {
        System.out.println("getTerms");
        TimetableStructure instance = new TimetableStructure();
        String expResult = "";
        String result = instance.getTerms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
