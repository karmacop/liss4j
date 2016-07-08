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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author MHS
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({liss.StudentListIT.class, liss.ClassListIT.class, liss.BellTimeListIT.class, liss.RoomIT.class, liss.UtilIT.class, liss.CalendarListIT.class, liss.TermIT.class, liss.TermListIT.class, liss.LissGenericListIT.class, liss.CourseClassIT.class, liss.HelloIT.class, liss.TimetableIT.class, liss.BellTimeIT.class, liss.ClassMembershipIT.class, liss.TeacherListIT.class, liss.RoomListIT.class, liss.DailyDataListIT.class, liss.StudentIT.class, liss.CourseClassListIT.class, liss.TeacherIT.class, liss.CalendarIT.class, liss.TimetableStructureIT.class, liss.ClassMembershipChangeIT.class, liss.AuthenticationIT.class, liss.LissGenericIT.class, liss.TimetableListIT.class, liss.TimetableStructureListIT.class, liss.DailyDataIT.class, liss.ClassMembershipListIT.class})
public class LissITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
