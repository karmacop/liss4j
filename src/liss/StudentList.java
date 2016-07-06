/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Glenn Tester
 */
public class StudentList extends LissGenericList<Student> {

    public StudentList() {
        super();
    }
    
    public StudentList(Object[] objects) {
        super(objects, Student.class);
    }
    
    /*public StudentList() {
        super();
    }
    
    public StudentList(Object[] objects) {
        super(objects,Student.class);
    }*/

    
    
}
