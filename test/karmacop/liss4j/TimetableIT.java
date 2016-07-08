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

import karmacop.liss4j.Timetable;
import java.util.ArrayList;
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
public class TimetableIT {
    
    public TimetableIT() {
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
     * Test of setPeriod method, of class Timetable.
     */
    @Test
    public void testSetPeriod() {
        System.out.println("setPeriod");
        String period = "";
        Timetable instance = new Timetable();
        instance.setPeriod(period);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeriod method, of class Timetable.
     */
    @Test
    public void testGetPeriod() {
        System.out.println("getPeriod");
        Timetable instance = new Timetable();
        String expResult = "";
        String result = instance.getPeriod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassCode method, of class Timetable.
     */
    @Test
    public void testSetClassCode() {
        System.out.println("setClassCode");
        String classCode = "";
        Timetable instance = new Timetable();
        instance.setClassCode(classCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassCode method, of class Timetable.
     */
    @Test
    public void testGetClassCode() {
        System.out.println("getClassCode");
        Timetable instance = new Timetable();
        String expResult = "";
        String result = instance.getClassCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeacherIDs method, of class Timetable.
     */
    @Test
    public void testSetTeacherIDs() {
        System.out.println("setTeacherIDs");
        String teacherIds = "";
        Timetable instance = new Timetable();
        instance.setTeacherIDs(teacherIds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacherIds method, of class Timetable.
     */
    @Test
    public void testGetTeacherIds() {
        System.out.println("getTeacherIds");
        Timetable instance = new Timetable();
        String expResult = "";
        String result = instance.getTeacherIds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacherIdsArray method, of class Timetable.
     */
    @Test
    public void testGetTeacherIdsArray() {
        System.out.println("getTeacherIdsArray");
        Timetable instance = new Timetable();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getTeacherIdsArray();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomId method, of class Timetable.
     */
    @Test
    public void testSetRoomId() {
        System.out.println("setRoomId");
        String roomId = "";
        Timetable instance = new Timetable();
        instance.setRoomId(roomId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomId method, of class Timetable.
     */
    @Test
    public void testGetRoomId() {
        System.out.println("getRoomId");
        Timetable instance = new Timetable();
        String expResult = "";
        String result = instance.getRoomId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomCode method, of class Timetable.
     */
    @Test
    public void testSetRoomCode() {
        System.out.println("setRoomCode");
        String roomCode = "";
        Timetable instance = new Timetable();
        instance.setRoomCode(roomCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomCode method, of class Timetable.
     */
    @Test
    public void testGetRoomCode() {
        System.out.println("getRoomCode");
        Timetable instance = new Timetable();
        String expResult = "";
        String result = instance.getRoomCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTtStructure method, of class Timetable.
     */
    @Test
    public void testSetTtStructure() {
        System.out.println("setTtStructure");
        String ttStructure = "";
        Timetable instance = new Timetable();
        instance.setTtStructure(ttStructure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTtStructure method, of class Timetable.
     */
    @Test
    public void testGetTtStructure() {
        System.out.println("getTtStructure");
        Timetable instance = new Timetable();
        String expResult = "";
        String result = instance.getTtStructure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
