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
public class Term extends LissGeneric {

    static final public String SEMESTER_ID = "SemesterId";
    static final public String SEMESTER = "Semester";
    static final public String TERM_ID = "TermId";
    static final public String TERM = "Term";
    static final public String START_DATE = "StartDate";
    static final public String END_DATE = "EndDate";
    
    public Term() {
        super();
    }
        public Term(int SemesterId, String Semester, 
                int TermId, String Term, 
                Date StartDate, Date EndDate) {
            this.put("SemesterId", SemesterId);
            this.put("Semester", Semester);
            this.put("TermId", TermId);
            this.put("Term", Term);
            this.put("StartDate", StartDate);
            this.put("EndDate", EndDate);
        }
        
    public void setSemesterID(String semesterId) {
        this.put(SEMESTER_ID, semesterId);
    }

    public String getSemesterID() {
        return (String) this.get(SEMESTER_ID);
    }
    
    public void setSemester(String semester) {
        this.put(SEMESTER, semester);
    }

    public String getSemester() {
        return (String) this.get(SEMESTER);
    }
    
    public void setTermId(String termId) {
        this.put(TERM_ID, termId);
    }

    public String getTermId() {
        return (String) this.get(TERM_ID);
    }
    
    public void setTerm(String term) {
        this.put(TERM, term);
    }

    public String getTerm() {
        return (String) this.get(TERM);
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