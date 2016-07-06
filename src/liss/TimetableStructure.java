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

    public TimetableStructure() {
    }
        

        public TimetableStructure(String TtStructure, int AcademicYear, 
                TermList Terms) {
            this.put("TtStructure", String.format("%1$20s", TtStructure).trim());
            this.put("AcademicYear", AcademicYear); //4 digits
            this.put("Terms", Terms);
        }
}