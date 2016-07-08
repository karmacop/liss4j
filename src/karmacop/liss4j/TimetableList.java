/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class TimetableList extends LissGenericList<Timetable> {
    
    public TimetableList() {
        super();
    }
    
    public TimetableList(Timetable[] timetables) {
        super(timetables,Timetable.class);
    }
}
