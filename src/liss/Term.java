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
public class Term extends LissGeneric {

    public Term() {
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
}