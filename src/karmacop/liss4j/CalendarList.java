/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class CalendarList extends LissGenericList<Calendar> {
    
    public CalendarList() {
        super();
    }
    
    public CalendarList(Calendar[] calendars) {
        super(calendars,Calendar.class);
    }
    
}
