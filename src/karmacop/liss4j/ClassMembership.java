/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

import java.util.Date;

/**
 *
 * @author Glenn Tester
 */
public class ClassMembership extends LissGeneric {

    static final public String STUDENT_ID = "StudentId";
    static final public String CLASS_CODE = "ClassCode";
    static final public String START_DATE = "StartDate";
    static final public String END_DATE = "EndDate";
    static final public String EDVAL_CLASS_CODE = "EdvalClassCode";
    
    public ClassMembership() {
        super();
    }

    public ClassMembership(String StudentId, String ClassCode, 
            Date StartDate, Date EndDate) {
        this.put(STUDENT_ID, String.format("%1$20s", StudentId) );
        this.put(CLASS_CODE, String.format("%1$20s", ClassCode) );
        this.put(START_DATE, StartDate);
        this.put(END_DATE, EndDate);
    }
    
    public void setEdvalClassCode(String edvalClassCode) {
        this.put(EDVAL_CLASS_CODE, String.format("%1$20s", edvalClassCode) );
    }
    
    public String getEdvalClassCode() {
        return (String) this.get(EDVAL_CLASS_CODE );
    }
    
    public void setStudentID(String StudentId) {
        this.put(STUDENT_ID, String.format("%1$20s", StudentId));
    }
    
    public String getStudentID() {
        return (String) this.get(STUDENT_ID);
    }
    
    public void setClassCode(String ClassCode) {
        this.put(CLASS_CODE, String.format("%1$20s", ClassCode));
    }
    
    public String getClassCode() {
        return (String) this.get(CLASS_CODE);
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
}
