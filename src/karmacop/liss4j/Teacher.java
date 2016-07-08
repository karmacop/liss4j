/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class Teacher extends LissGeneric implements Comparable<Teacher> {

    static final public String TEACHER_ID = "TeacherId";
    static final public String TEACHER_CODE = "TeacherCode";
    static final public String TITLE = "Title";
    static final public String FIRST_NAME = "FirstName";
    static final public String SURNAME = "Surname";
    static final public String PREFERRED_NAME = "PreferredName";
    static final public String DISPLAY_NAME = "DisplayName";
    static final public String FACULTY = "Faculty";
    static final public String STAFF_TYPE = "StaffType";
    static final public String GENDER = "Gender";
    static final public String DAYS_AVAILABLE = "DaysAvailable";
    static final public String EMAIL = "Email";
    static final public String PHONE = "Phone";
    
    public Teacher() {
        super();
    }

    public Teacher(String teacherId, String teacherCode,
            String title, String firstName,
            String surname, String preferredName,
            String displayName, String faculty,
            String staffType, String gender,
            String daysAvailable, String email,
            String phone) {
        this.put(TEACHER_ID, String.format("%1$20s", teacherId));
        this.put(TEACHER_CODE, String.format("%1$20s", teacherCode));
        this.put(TITLE, title);
        this.put(FIRST_NAME, firstName);
        this.put(SURNAME, surname);
        this.put(PREFERRED_NAME, preferredName);
        this.put(DISPLAY_NAME, displayName);
        this.put(FACULTY, faculty);
        this.put(STAFF_TYPE, staffType);
        this.put(GENDER, gender);
        this.put(DAYS_AVAILABLE, daysAvailable);
        this.put(EMAIL, email);
        this.put(PHONE, phone); //mobile phone
    }

    public void setTeacherID(String teacherId) {
        this.put(TEACHER_ID, String.format("%1$20s", teacherId));
    }

    public String getTeacherID() {
        return (String) this.get(TEACHER_ID);
    }

    public void setTeacherCode(String teacherCode) {
        this.put(TEACHER_CODE, teacherCode);
    }

    public String getTeacherCode() {
        return (String) this.get(TEACHER_CODE);
    }

    public void setTitle(String title) {
        this.put(TITLE, title);
    }

    public String getTitle() {
        return (String) this.get(TITLE);
    }

    public void setFirstName(String firstName) {
        this.put(FIRST_NAME, firstName);
    }

    public String getFirstName() {
        return (String) this.get(FIRST_NAME);
    }

    public void setSurname(String surname) {
        this.put(SURNAME, surname);
    }

    public String getSurname() {
        return (String) this.get(SURNAME);
    }

    public void setPreferredName(String preferredName) {
        this.put(PREFERRED_NAME, preferredName);
    }

    public String getPreferredName() {
        return (String) this.get(PREFERRED_NAME);
    }

    public void setDisplayName(String displayName) {
        this.put(DISPLAY_NAME, displayName);
    }

    public String getDisplayName() {
        return (String) this.get(DISPLAY_NAME);
    }

    public void setFaculty(String faculty) {
        this.put(FACULTY, faculty);
    }

    public String getFaculty() {
        return (String) this.get(FACULTY);
    }

    public void setStaffType(String staffType) {
        this.put(STAFF_TYPE, staffType);
    }

    public String getStaffType() {
        return (String) this.get(STAFF_TYPE);
    }

    public void setGender(String gender) {
        this.put(GENDER, gender);
    }

    public String getGender() {
        return (String) this.get(GENDER);
    }

    public void setDaysAvailable(String daysAvailable) {
        this.put(DAYS_AVAILABLE, daysAvailable);
    }

    public String getDaysAvailable() {
        return (String) this.get(DAYS_AVAILABLE);
    }

    public void setEmail(String email) {
        this.put(EMAIL, email);
    }

    public String getEmail() {
        return (String) this.get(EMAIL);
    }

    public void setPhone(String phone) {
        this.put(PHONE, phone);
    }

    public String getPhone() {
        return (String) this.get(PHONE);
    }

    @Override
    public int compareTo(Teacher o) {
        return this.hashCode() - o.hashCode();
    }
}
