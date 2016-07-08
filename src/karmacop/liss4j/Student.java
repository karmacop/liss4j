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

/**
 *
 * @author Glenn Tester
 */
public class Student extends LissGeneric {
    
    static final public String STUDENT_ID = "StudentId";
    static final public String FIRST_NAME = "FirstName";
    static final public String SURNAME = "Surname";
    static final public String PREFERRED_NAME = "PreferredName";
    static final public String FORM = "Form";
    static final public String ROLL_GROUP = "RollGroup";
    static final public String HOUSE = "House";
    static final public String GENDER = "Gender";
    static final public String STATEWIDE_ID = "StatewideId";
    static final public String EMAIL = "Email";
    static final public String PHONE = "Phone";

    public Student() {
        super();
    }
    
    public Student(String studentId, String firstName,
            String surname, String preferredName,
            String form, String rollGroup,
            String house, String gender,
            String statewideId, String email,
            String phone) {
        this.put(STUDENT_ID, String.format("%1$20s", studentId));
        this.put(FIRST_NAME, firstName);
        this.put(SURNAME, surname);
        this.put(PREFERRED_NAME, preferredName);
        this.put(FORM, form);
        this.put(ROLL_GROUP, rollGroup);
        this.put(HOUSE, house);
        this.put(GENDER, gender);
        this.put(STATEWIDE_ID, String.format("%1$20s", statewideId));
        this.put(EMAIL, email);
        this.put(PHONE, phone);
    }
    
    public void setStudentID(String studentId) {
        this.put(STUDENT_ID, String.format("%1$20s", studentId));
    }
    
    public String getStudentID() {
        return (String) this.get(STUDENT_ID);
    }
    
    public void setFirstName(String firstName) {
        this.put(FIRST_NAME, firstName );
    }
    
    public String getFirstName() {
        return (String) this.get(FIRST_NAME);
    }
    
    public void setSurname(String surname) {
        this.put(SURNAME, surname );
    }
    
    public String getSurname() {
        return (String) this.get(SURNAME);
    }
    
    public void setPreferredName(String preferredName) {
        this.put(PREFERRED_NAME, preferredName );
    }
    
    public String getPreferredName() {
        return (String) this.get(PREFERRED_NAME);
    }
    
    public void setForm(String form) {
        this.put(FORM, form);
    }
    
    public String getForm() {
        return (String) this.get(FORM);
    }
    
    public void setRollGroup(String rollGroup) {
        this.put(ROLL_GROUP, rollGroup );
    }
    
    public String getRollGroup() {
        return (String) this.get(ROLL_GROUP);
    }
    
    public void setHouse(String house) {
        this.put(HOUSE, house);
    }
    
    public String getHouse() {
        return (String) this.get(HOUSE);
    }
    
    public void setGender(String gender) {
        this.put(GENDER, gender);
    }
    
    public String getGender() {
        return (String) this.get(GENDER);
    }
    
    public void setStatewideId(String statewideId) {
        this.put(STATEWIDE_ID, String.format("%1$20s", statewideId) );
    }
    
    public String getStatewideId() {
        return (String) this.get(STATEWIDE_ID);
    }
    
    public void setEmail(String email) {
        this.put(EMAIL, email );
    }
    
    public String getEmail() {
        return (String) this.get(EMAIL);
    }
    
    public void setPhone(String phone) {
        this.put(PHONE, phone );
    }
    
    public String getPhone() {
        return (String) this.get(PHONE);
    }
}