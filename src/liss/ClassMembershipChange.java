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
public class ClassMembershipChange extends LissGeneric {

    public ClassMembershipChange() {
        super();
    }

    public ClassMembershipChange(String studentId, Date date,
            ClassList outOfClasses, ClassList intoClasses) {
        this.put("studentId", studentId);
        this.put("date", date);
        this.put("outOfClasses", outOfClasses);
        this.put("intoClasses", intoClasses);
    }

    public String getStudentId() {
        return (String) this.get("studentId");
    }

    public void setStudentId(String studentId) {
        this.put("studentId", studentId);
    }

    public Date getDate() {
        return (Date) this.get("date");
    }

    public void setDate(Date date) {
        this.put("date", date);
    }

    public ClassList getOutOfClasses() {
        return (ClassList) this.get("outOfClasses");
    }

    public void setOutOfClasses(ClassList outOfClasses) {
        this.put("outOfClasses", outOfClasses);
    }

    public ClassList getIntoClasses() {
        return (ClassList) this.get("intoClasses");
    }

    public void setIntoClasses(ClassList intoClasses) {
        this.put("intoClasses", intoClasses);
    }
    
    
}
