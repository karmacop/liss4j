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
