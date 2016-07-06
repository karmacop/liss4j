/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

import java.util.HashMap;

/**
 *
 * @author Glenn Tester
 */
public class Student extends LissGeneric {

    public Student() {
        super();
    }
    
    public Student(HashMap<String,Object> map) {
        super(map);
    }

    public Student(String StudentId, String FirstName,
            String Surname, String PreferredName,
            String Form, String RollGroup,
            String House, String Gender,
            String StatewideId, String Email,
            String Phone) {
        setStudentID(StudentId);
        setFirstName(FirstName);
        setSurname(Surname);
        setPreferredName(PreferredName);
        setForm(Form);
        setRollGroup(RollGroup);
        setHouse(House);
        setGender(Gender);
        setStatewideId(StatewideId);
        setEmail(Email);
        setPhone(Phone);
    }
    
    public void setStudentID(String string) {
        this.put("StudentId", String.format("%1$20s", string.trim() ).trim());
    }
    
    public String getStudentID() {
        return (String) this.get("StudentId");
    }
    
    public void setFirstName(String string) {
        this.put("FirstName", string.trim() );
    }
    
    public String getFirstName() {
        return (String) this.get("FirstName" );
    }
    
    public void setSurname(String string) {
        this.put("Surname", string.trim() );
    }
    
    public String getSurname() {
        return (String) this.get("Surname" );
    }
    
    public void setPreferredName(String string) {
        this.put("PreferredName", string.trim() );
    }
    
    public String getPreferredName() {
        return (String) this.get("PreferredName" );
    }
    
    public void setForm(String string) {
        this.put("Form", string.trim() );
    }
    
    public String getForm() {
        return (String) this.get("Form" );
    }
    
    public void setRollGroup(String string) {
        this.put("RollGroup", string.trim() );
    }
    
    public String getRollGroup() {
        return (String) this.get("RollGroup" );
    }
    
    public void setHouse(String string) {
        this.put("House", string.trim() );
    }
    
    public String getHouse() {
        return (String) this.get("House" );
    }
    
    public void setGender(String string) {
        this.put("Gender", string.trim() );
    }
    
    public String getGender() {
        return (String) this.get("Gender" );
    }
    
    public void setStatewideId(String string) {
        this.put("StatewideId", String.format("%1$20s", string.trim()).trim() );
    }
    
    public String getStatewideId() {
        return (String) this.get("StatewideId");
    }
    
    public void setEmail(String string) {
        this.put("Email", string.trim() );
    }
    
    public String getEmail() {
        return (String) this.get("Email");
    }
    
    public void setPhone(String string) {
        this.put("Phone", string.trim() );
    }
    
    public String getPhone() {
        return (String) this.get("Phone");
    }
}