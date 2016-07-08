/* 
 * Copyright (C) 2016 Glenn Tester.
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

import java.util.Date;

/**
 *
 * @author Glenn Tester
 */
public class CourseClass extends LissGeneric {

    static final public String CLASS_CODE = "ClassCode";
    static final public String COURSE_NAME = "CourseName";
    static final public String DEFAULT_TEACHER = "DefaultTeacher";
    static final public String TYPE = "Type";
    static final public String TT_STRUCTURE = "TtStructure";
    static final public String START_DATE = "StartDate";
    static final public String END_DATE = "EndDate";
    static final public String COLOUR = "Colour";
    static final public String FORM = "Form";
    static final public String FACULTY = "Faculty";
    static final public String EDVAL_CLASS_CODE = "EdvalClassCode";
    
    /**
     * &lt;blank&gt; or omitted field:  A normal teaching class.
     */
    public static final String TEACHING = "";
    /**
     * A yard duty or other duty
     */
    public static final String DUTY = "Duty";
    /**
     * A study period
     */
    public static final String STUDY = "Study";
    public static final String ROLLCLASS = "RollClass";
    public static final String RTO = "RTO";
    public static final String STAFFMEETING = "StaffMeeting";
    public static final String EXTRACURRICULAR = "ExtraCurricular";
    public static final String ONCALL = "OnCall";
    //Extra
    public static final String HOUSE = "House";

    /*
    One of the following strings:
<blank> or omitted field:  A normal teaching class.
Duty : A yard duty or other duty
Study : A study period
RollClass : Also known as HomeGroup, RollCall, etc.
RTO : Rostered Time Off
StaffMeeting : Staff meeting
ExtraCurricular : e.g. sports
OnCall : On-call period (the teacher is free on this period unless they take a cover, and they’re encouraged to take covers during their on-call periods)
     */

    public CourseClass() {
        super();
    }

    public CourseClass(String classCode, String courseName,
            String defaultTeacher, String type,
            String ttStructure, Date startDate,
            Date endDate, String colour,
            String form, String faculty) {
        this.put(CLASS_CODE, String.format("%1$20s", classCode)); //courseCode> and <class identifier> separated by a space, e.g “9MAT 1
        this.put(COURSE_NAME, courseName); //curriculum
        this.put(DEFAULT_TEACHER, String.format("%1$20s", defaultTeacher));
        this.put(TYPE, type); //course, house roll
        this.put(TT_STRUCTURE, String.format("%1$20s", ttStructure)); //timetable structure id then comma seperated terms eg 2012Junior 3,4
        this.put(START_DATE, startDate);
        this.put(END_DATE, endDate);
        this.put(COLOUR, colour); //0000ff
        this.put(FORM, form);
        this.put(FACULTY, faculty);
    }

    public void setEdvalClassCode(String edvalClassCode) {
        this.put(EDVAL_CLASS_CODE, edvalClassCode);
    }

    public String getEdvalClassCode() {
        return (String) this.get(EDVAL_CLASS_CODE);
    }

    public void setClassCode(String classCode) {
        this.put(CLASS_CODE, String.format("%1$20s", classCode));
    }

    public String getClassCode() {
        return (String) this.get(CLASS_CODE);
    }

    public void setCourseName(String courseName) {
        this.put(COURSE_NAME, courseName);
    }

    public String getCourseName() {
        return (String) this.get(COURSE_NAME);
    }

    public void setDefaultTeacher(String defaultTeacher) {
        this.put(DEFAULT_TEACHER, String.format("%1$20s", defaultTeacher));
    }

    public String getDefaultTeacher() {
        return (String) this.get(DEFAULT_TEACHER);
    }

    public void setType(String type) {
        this.put(TYPE, type);
    }

    public String getType() {
        return (String) this.get(TYPE);
    }

    public void setTtStructure(String ttStructure) {
        this.put(TT_STRUCTURE, String.format("%1$20s", ttStructure));
    }

    public String getTtStructure() {
        return (String) this.get(TT_STRUCTURE);
    }

    public void setStartDate(String startDate) {
        this.put(START_DATE, startDate);
    }

    public String getStartDate() {
        return (String) this.get(START_DATE);
    }

    public void setEndDate(String endDate) {
        this.put(END_DATE, endDate);
    }

    public String getEndDate() {
        return (String) this.get(END_DATE);
    }

    public void setColour(String colour) {
        this.put(COLOUR, colour);
    }

    public String getColour() {
        return (String) this.get(COLOUR);
    }

    public void setForm(String form) {
        this.put(FORM, form);
    }

    public String getForm() {
        return (String) this.get(FORM);
    }

    public void setFaculty(String faculty) {
        this.put(FACULTY, faculty);
    }

    public String getFaculty() {
        return (String) this.get(FACULTY);
    }
}
