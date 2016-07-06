/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class TimetableStructure extends LissGeneric {
    
    static final public String TT_STRUCTURE = "TtStructure";
    static final public String ACADEMIC_YEAR = "AcademicYear";
    static final public String TERMS = "Terms";

    public TimetableStructure() {
    }

    public TimetableStructure(String TtStructure, int AcademicYear,
            TermList Terms) {
        this.put(TT_STRUCTURE, String.format("%1$20s", TtStructure));
        this.put(ACADEMIC_YEAR, AcademicYear); //4 digits
        this.put(TERMS, Terms);
    }
}
