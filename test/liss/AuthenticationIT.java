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
public class AuthenticationIT {
    
    public AuthenticationIT() {
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
     * Test of getSchool method, of class Authentication.
     */
    @Test
    public void testGetSchool() {
        //System.out.println("getSchool");
        Authentication instance = new Authentication();
        String expResult = "getSchool";
        instance.setSchool(expResult);
        String result = instance.getSchool();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSchool method, of class Authentication.
     */
    @Test
    public void testSetSchool() {
        //System.out.println("setSchool");
        String school = "setSchool";
        Authentication instance = new Authentication();
        instance.setSchool(school);
        assertEquals(school, instance.getSchool());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class Authentication.
     */
    @Test
    public void testGetUserName() {
        //System.out.println("getUserName");
        Authentication instance = new Authentication();
        String expResult = "getUserName";
        instance.setUserName(expResult);
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class Authentication.
     */
    @Test
    public void testSetUserName() {
        //System.out.println("setUserName");
        String userName = "setUserName";
        Authentication instance = new Authentication();
        instance.setUserName(userName);
        assertEquals(userName, instance.getUserName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Authentication.
     */
    @Test
    public void testGetPassword() {
        //System.out.println("getPassword");
        Authentication instance = new Authentication();
        String expResult = "getPassword";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Authentication.
     */
    @Test
    public void testSetPassword() {
        //System.out.println("setPassword");
        String password = "setPassword";
        Authentication instance = new Authentication();
        instance.setPassword(password);
        assertEquals(password, this);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLissVersion method, of class Authentication.
     */
    @Test
    public void testGetLissVersion() {
        System.out.println("getLissVersion");
        Authentication instance = new Authentication();
        int expResult = 0;
        int result = instance.getLissVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLissVersion method, of class Authentication.
     */
    @Test
    public void testSetLissVersion() {
        System.out.println("setLissVersion");
        int lissVersion = 0;
        Authentication instance = new Authentication();
        instance.setLissVersion(lissVersion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserAgent method, of class Authentication.
     */
    @Test
    public void testGetUserAgent() {
        System.out.println("getUserAgent");
        Authentication instance = new Authentication();
        String expResult = "";
        String result = instance.getUserAgent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserAgent method, of class Authentication.
     */
    @Test
    public void testSetUserAgent() {
        System.out.println("setUserAgent");
        String userAgent = "";
        Authentication instance = new Authentication();
        instance.setUserAgent(userAgent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
