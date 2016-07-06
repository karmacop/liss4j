/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class CalendarList extends LissGenericList<Calendar> {
    
    public CalendarList() {
        super();
    }
    
    public CalendarList(Calendar[] objects) {
        super(objects,Calendar.class);
    }
    
}
