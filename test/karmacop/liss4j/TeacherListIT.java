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

import karmacop.liss4j.Teacher;
import karmacop.liss4j.TeacherList;
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
public class TeacherListIT {
    
    public TeacherListIT() {
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
     * Test of getTeacherFromLastCommaFirstName method, of class TeacherList.
     */
    @Test
    public void testGetTeacherFromLastCommaFirstName() {
        System.out.println("getTeacherFromLastCommaFirstName");
        String teacherName = "";
        TeacherList instance = new TeacherList();
        Teacher expResult = null;
        Teacher result = instance.getTeacherFromLastCommaFirstName(teacherName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacherFromTeacherId method, of class TeacherList.
     */
    @Test
    public void testGetTeacherFromTeacherId() {
        System.out.println("getTeacherFromTeacherId");
        String teacherId = "";
        TeacherList instance = new TeacherList();
        Teacher expResult = null;
        Teacher result = instance.getTeacherFromTeacherId(teacherId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacherFromTeacherCode method, of class TeacherList.
     */
    @Test
    public void testGetTeacherFromTeacherCode() {
        System.out.println("getTeacherFromTeacherCode");
        String teacherCode = "";
        TeacherList instance = new TeacherList();
        Teacher expResult = null;
        Teacher result = instance.getTeacherFromTeacherCode(teacherCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
