/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

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
     * 
     */
    public static final String TEACHING = "";
    public static final String DUTY = "Duty";
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

    public CourseClass(String ClassCode, String CourseName,
            String DefaultTeacher, String Type,
            String TtStructure, Date StartDate,
            Date EndDate, String Colour,
            String Form, String Faculty) {
        this.put(CLASS_CODE, String.format("%1$20s", ClassCode.trim()).trim()); //courseCode> and <class identifier> separated by a space, e.g “9MAT 1
        this.put(COURSE_NAME, CourseName); //curriculum
        this.put(DEFAULT_TEACHER, String.format("%1$20s", DefaultTeacher.trim()).trim());
        this.put(TYPE, Type); //course, house roll
        this.put(TT_STRUCTURE, String.format("%1$20s", TtStructure.trim()).trim()); //timetable structure id then comma seperated terms eg 2012Junior 3,4
        this.put(START_DATE, StartDate);
        this.put(END_DATE, EndDate);
        this.put(COLOUR, Colour); //0000ff
        this.put(FORM, Form);
        this.put(FACULTY, Faculty);
    }

    public void setEdvalClassCode(String string) {
        this.put("EdvalClassCode", String.format("%1$20s", string.trim()).trim());
    }

    public String getEdvalClassCode() {
        return (String) this.get("EdvalClassCode");
    }

    public void setClassCode(String string) {
        this.put("ClassCode", String.format("%1$20s", string.trim()).trim());
    }

    public String getClassCode() {
        return (String) this.get("ClassCode");
    }

    public void setCourseName(String string) {
        this.put("CourseName", string.trim());
    }

    public String getCourseName() {
        return (String) this.get("CourseName");
    }

    public void setDefaultTeacher(String string) {
        this.put("DefaultTeacher", String.format("%1$20s", string.trim()).trim());
    }

    public String getDefaultTeacher() {
        return (String) this.get("DefaultTeacher");
    }

    public void setType(String string) {
        this.put("Type", string.trim());
    }

    public String getType() {
        return (String) this.get("Type");
    }

    public void setTtStructure(String string) {
        this.put("TtStructure", String.format("%1$20s", string.trim()).trim());
    }

    public String getTtStructure() {
        return (String) this.get("TtStructure");
    }

    public void setStartDate(String string) {
        this.put("StartDate", string.trim());
    }

    public String getStartDate() {
        return (String) this.get("StartDate");
    }

    public void setEndDate(String string) {
        this.put("EndDate", string.trim());
    }

    public String getEndDate() {
        return (String) this.get("EndDate");
    }

    public void setColour(String string) {
        this.put("Colour", string.trim());
    }

    public String getColour() {
        return (String) this.get("Colour");
    }

    public void setForm(String string) {
        this.put("Form", string.trim());
    }

    public String getForm() {
        return (String) this.get("Form");
    }

    public void setFaculty(String string) {
        this.put("Faculty", string.trim());
    }

    public String getFaculty() {
        return (String) this.get("Faculty");
    }
}
