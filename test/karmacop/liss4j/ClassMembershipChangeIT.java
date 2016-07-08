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

import karmacop.liss4j.ClassList;
import karmacop.liss4j.ClassMembershipChange;
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
public class ClassMembershipChangeIT {
    
    public ClassMembershipChangeIT() {
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
     * Test of getStudentId method, of class ClassMembershipChange.
     */
    @Test
    public void testGetStudentId() {
        System.out.println("getStudentId");
        ClassMembershipChange instance = new ClassMembershipChange();
        String expResult = "";
        String result = instance.getStudentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentId method, of class ClassMembershipChange.
     */
    @Test
    public void testSetStudentId() {
        System.out.println("setStudentId");
        String studentId = "";
        ClassMembershipChange instance = new ClassMembershipChange();
        instance.setStudentId(studentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class ClassMembershipChange.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        ClassMembershipChange instance = new ClassMembershipChange();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class ClassMembershipChange.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        ClassMembershipChange instance = new ClassMembershipChange();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutOfClasses method, of class ClassMembershipChange.
     */
    @Test
    public void testGetOutOfClasses() {
        System.out.println("getOutOfClasses");
        ClassMembershipChange instance = new ClassMembershipChange();
        ClassList expResult = null;
        ClassList result = instance.getOutOfClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutOfClasses method, of class ClassMembershipChange.
     */
    @Test
    public void testSetOutOfClasses() {
        System.out.println("setOutOfClasses");
        ClassList outOfClasses = null;
        ClassMembershipChange instance = new ClassMembershipChange();
        instance.setOutOfClasses(outOfClasses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntoClasses method, of class ClassMembershipChange.
     */
    @Test
    public void testGetIntoClasses() {
        System.out.println("getIntoClasses");
        ClassMembershipChange instance = new ClassMembershipChange();
        ClassList expResult = null;
        ClassList result = instance.getIntoClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntoClasses method, of class ClassMembershipChange.
     */
    @Test
    public void testSetIntoClasses() {
        System.out.println("setIntoClasses");
        ClassList intoClasses = null;
        ClassMembershipChange instance = new ClassMembershipChange();
        instance.setIntoClasses(intoClasses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
