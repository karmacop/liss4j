/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class TimetableList extends LissGenericList<Timetable> {
    
    public TimetableList() {
        super();
    }
    
    public TimetableList(Timetable[] objects) {
        super(objects,Timetable.class);
    }
}
