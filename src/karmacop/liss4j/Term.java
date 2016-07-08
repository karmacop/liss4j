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