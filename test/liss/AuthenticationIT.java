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
        Authentication instance = new Authentication();
        String expResult = "getSchool";
        instance.setSchool(expResult);
        String result = instance.getSchool();
        assertEquals(expResult, result);
        assertEquals(expResult, instance.get(Authentication.SCHOOL));
    }

    /**
     * Test of setSchool method, of class Authentication.
     */
    @Test
    public void testSetSchool() {
        String school = "setSchool";
        Authentication instance = new Authentication();
        instance.setSchool(school);
        assertEquals(school, instance.getSchool());
        assertEquals(school, instance.get(Authentication.SCHOOL));
    }

    /**
     * Test of getUserName method, of class Authentication.
     */
    @Test
    public void testGetUserName() {
        Authentication instance = new Authentication();
        String expResult = "getUserName";
        instance.setUserName(expResult);
        String result = instance.getUserName();
        assertEquals(expResult, result);
        assertEquals(expResult, instance.get(Authentication.USER_NAME));
    }

    /**
     * Test of setUserName method, of class Authentication.
     */
    @Test
    public void testSetUserName() {
        String userName = "setUserName";
        Authentication instance = new Authentication();
        instance.setUserName(userName);
        assertEquals(userName, instance.getUserName());
        assertEquals(userName, instance.get(Authentication.USER_NAME));
    }

    /**
     * Test of getPassword method, of class Authentication.
     */
    @Test
    public void testGetPassword() {
        Authentication instance = new Authentication();
        String expResult = "getPassword";
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
        assertEquals(expResult, instance.get(Authentication.PASSWORD));
    }

    /**
     * Test of setPassword method, of class Authentication.
     */
    @Test
    public void testSetPassword() {
        String password = "setPassword";
        Authentication instance = new Authentication();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
        assertEquals(password, instance.get(Authentication.PASSWORD));
    }

    /**
     * Test of getLissVersion method, of class Authentication.
     */
    @Test
    public void testGetLissVersion() {
        Authentication instance = new Authentication();
        int expResult = 10000;
        instance.setLissVersion(expResult);
        int result = instance.getLissVersion();
        assertEquals(expResult, result);
        assertEquals(expResult, instance.get(Authentication.LISS_VERSION));
    }

    /**
     * Test of setLissVersion method, of class Authentication.
     */
    @Test
    public void testSetLissVersion() {
        int lissVersion = 0;
        Authentication instance = new Authentication();
        instance.setLissVersion(lissVersion);
        assertEquals(lissVersion, instance.get(Authentication.LISS_VERSION));
    }

    /**
     * Test of getUserAgent method, of class Authentication.
     */
    @Test
    public void testGetUserAgent() {
        Authentication instance = new Authentication();
        String expResult = "getUserAgent";
        instance.setUserAgent(expResult);
        String result = instance.getUserAgent();
        assertEquals(expResult, result);
        assertEquals(expResult, instance.get(Authentication.USER_AGENT));
    }

    /**
     * Test of setUserAgent method, of class Authentication.
     */
    @Test
    public void testSetUserAgent() {
        String userAgent = "setUserAgent";
        Authentication instance = new Authentication();
        instance.setUserAgent(userAgent);
        assertEquals(userAgent, instance.getUserAgent());
        assertEquals(userAgent, instance.get(Authentication.USER_AGENT));
    }
    
}
