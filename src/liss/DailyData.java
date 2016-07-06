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
public class DailyData extends LissGeneric {

    static final public String DATE = "Date";
    static final public String PERIOD = "Period";
    static final public String START_TIME = "StartTime";
    static final public String END_TIME = "EndTime";
    static final public String CLASS_CODE = "ClassCode";
    static final public String CLASS_NAME = "ClassName";
    static final public String TYPE = "Type";
    static final public String TEACHER_IDS = "TeacherIds";
    static final public String TEACHER_CODES = "TeacherCodes";
    static final public String ROOMS = "Rooms";
    static final public String STUDENTS = "Students";

    public DailyData() {
        super();
    }

    public DailyData(Date date, String period,
            String startTime, String endTime,
            String classCode, String className,
            String type, String teacherIds,
            String teacherCodes, String rooms,
            String students) {
        this.put("Date", date);
        this.put("Period", period);
        this.put("StartTime", startTime);
        this.put("EndTime", endTime);
        this.put("ClassCode", String.format("%1$20s", classCode));
        this.put("ClassName", className);
        this.put("Type", type);
        this.put("TeacherIds", teacherIds);
        this.put("TeacherCodes", teacherCodes);
        this.put("Rooms", rooms);
        this.put("Students", students);
    }

    public void setDate(Date date) {
        this.put(DATE, date);
    }

    public Date getDate() {
        return (Date) this.get(DATE);
    }

    public void setPeriod(String period) {
        this.put(PERIOD, period);
    }

    public String getPeriod() {
        return (String) this.get(PERIOD);
    }

    public void setStartTime(String startTime) {
        this.put(START_TIME, startTime);
    }

    public String getStartTime() {
        return (String) this.get(START_TIME);
    }

    public void setEndTime(String endTime) {
        this.put(END_TIME, endTime);
    }

    public String getEndTime() {
        return (String) this.get(END_TIME);
    }

    public void setClassCode(String classCode) {
        this.put(CLASS_CODE, String.format("%1$20s", classCode));
    }

    public String getClassCode() {
        return (String) this.get(CLASS_CODE);
    }

    public void setClassName(String className) {
        this.put(CLASS_NAME, className);
    }

    public String getClassName() {
        return (String) this.get(CLASS_NAME);
    }

    public void setType(String type) {
        this.put(TYPE, type);
    }

    public String getType() {
        return (String) this.get(TYPE);
    }

    public void setTeacherIds(String teacherIds) {
        this.put(TEACHER_IDS, teacherIds);
    }

    public String getTeacherIds() {
        return (String) this.get(TEACHER_IDS);
    }

    public void setTeacherCodes(String teacherCodes) {
        this.put(TEACHER_CODES, teacherCodes);
    }

    public String getTeacherCodes() {
        return (String) this.get(TEACHER_CODES);
    }

    public void setRooms(String rooms) {
        this.put(ROOMS, rooms);
    }

    public String getRooms() {
        return (String) this.get(ROOMS);
    }

    public void setStudents(String students) {
        this.put(STUDENTS, students);
    }

    public String getStudents() {
        return (String) this.get(STUDENTS);
    }
}
