/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class TimetableStructure extends LissGeneric {
    
    static final public String TT_STRUCTURE = "TtStructure";
    static final public String ACADEMIC_YEAR = "AcademicYear";
    static final public String TERMS = "Terms";

    public TimetableStructure() {
        super();
    }

    public TimetableStructure(String ttStructure, int academicYear,
            TermList terms) {
        this.put(TT_STRUCTURE, String.format("%1$20s", ttStructure));
        this.put(ACADEMIC_YEAR, academicYear); //4 digits
        this.put(TERMS, terms);
    }
    
    public void setTtStructure(String ttStructure) {
        this.put(TT_STRUCTURE, String.format("%1$20s", ttStructure) );
    }
    
    public String getTtStructure() {
        return (String) this.get(TT_STRUCTURE);
    }
    
    public void setAcademicYear(String academicYear) {
        this.put(ACADEMIC_YEAR, academicYear );
    }
    
    public int getAcademicYear() {
        return (int) this.get(ACADEMIC_YEAR);
    }
    
    public void setTerms(String terms) {
        this.put(TERMS, terms );
    }
    
    public String getTerms() {
        return (String) this.get(TERMS);
    }
}
