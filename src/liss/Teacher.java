/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author Glenn Tester
 */
public class Teacher extends LissGeneric implements Comparable<Teacher> {

    public Teacher() {
        super();
    }

    public Teacher(String TeacherId, String TeacherCode,
            String Title, String FirstName,
            String Surname, String PreferredName,
            String DisplayName, String Faculty,
            String StaffType, String Gender,
            String DaysAvailable, String Email,
            String Phone) {
        this.put("TeacherId", String.format("%1$20s", TeacherId).trim());
        this.put("TeacherCode", String.format("%1$20s", TeacherCode).trim());
        this.put("Title", Title);
        this.put("FirstName", FirstName);
        this.put("Surname", Surname);
        this.put("PreferredName", PreferredName);
        this.put("DisplayName", DisplayName);
        this.put("Faculty", Faculty);
        this.put("StaffType", StaffType);
        this.put("Gender", Gender);
        this.put("DaysAvailable", DaysAvailable);
        this.put("Email", Email);
        this.put("Phone", Phone); //mobile phone
    }

    public void setTeacherID(String string) {
        this.put("TeacherId", String.format("%1$20s", string.trim()).trim());
    }

    public String getTeacherID() {
        return (String) this.get("TeacherId");
    }

    public void setTeacherCode(String string) {
        this.put("TeacherCode", string.trim());
    }

    public String getTeacherCode() {
        return (String) this.get("TeacherCode");
    }

    public void setTitle(String string) {
        this.put("Title", string.trim());
    }

    public String getTitle() {
        return (String) this.get("Title");
    }

    public void setFirstName(String string) {
        this.put("FirstName", string.trim());
    }

    public String getFirstName() {
        return (String) this.get("FirstName");
    }

    public void setSurname(String string) {
        this.put("Surname", string.trim());
    }

    public String getSurname() {
        return (String) this.get("Surname");
    }

    public void setPreferredName(String string) {
        this.put("PreferredName", string.trim());
    }

    public String getPreferredName() {
        return (String) this.get("PreferredName");
    }

    public void setDisplayName(String string) {
        this.put("DisplayName", string.trim());
    }

    public String getDisplayName() {
        return (String) this.get("DisplayName");
    }

    public void setFaculty(String string) {
        this.put("Faculty", string.trim());
    }

    public String getFaculty() {
        return (String) this.get("Faculty");
    }

    public void setStaffType(String string) {
        this.put("StaffType", string.trim());
    }

    public String getStaffType() {
        return (String) this.get("StaffType");
    }

    public void setGender(String string) {
        this.put("Gender", string.trim());
    }

    public String getGender() {
        return (String) this.get("Gender");
    }

    public void setDaysAvailable(String string) {
        this.put("DaysAvailable", string.trim());
    }

    public String getDaysAvailable() {
        return (String) this.get("DaysAvailable");
    }

    public void setEmail(String string) {
        this.put("Email", string.trim());
    }

    public String getEmail() {
        return (String) this.get("Email");
    }

    public void setPhone(String string) {
        this.put("Phone", string.trim());
    }

    public String getPhone() {
        return (String) this.get("Phone");
    }

    @Override
    public int compareTo(Teacher o) {
        return this.hashCode() - o.hashCode();
    }
}
