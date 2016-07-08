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
public class RoomIT {
    
    public RoomIT() {
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
     * Test of setRoomId method, of class Room.
     */
    @Test
    public void testSetRoomId() {
        System.out.println("setRoomId");
        String roomId = "";
        Room instance = new Room();
        instance.setRoomId(roomId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomId method, of class Room.
     */
    @Test
    public void testGetRoomId() {
        System.out.println("getRoomId");
        Room instance = new Room();
        String expResult = "";
        String result = instance.getRoomId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomCode method, of class Room.
     */
    @Test
    public void testSetRoomCode() {
        System.out.println("setRoomCode");
        String roomCode = "";
        Room instance = new Room();
        instance.setRoomCode(roomCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomCode method, of class Room.
     */
    @Test
    public void testGetRoomCode() {
        System.out.println("getRoomCode");
        Room instance = new Room();
        String expResult = "";
        String result = instance.getRoomCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Room.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Room instance = new Room();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Room.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Room instance = new Room();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Room.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Room instance = new Room();
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Room.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Room instance = new Room();
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCampus method, of class Room.
     */
    @Test
    public void testSetCampus() {
        System.out.println("setCampus");
        String campus = "";
        Room instance = new Room();
        instance.setCampus(campus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCampus method, of class Room.
     */
    @Test
    public void testGetCampus() {
        System.out.println("getCampus");
        Room instance = new Room();
        String expResult = "";
        String result = instance.getCampus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
