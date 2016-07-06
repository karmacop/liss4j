/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;


/**
 *
 * @author Glenn Tester
 */
public class StudentList extends LissGenericList<Student> {

    public StudentList() {
        super();
    }
    
    public StudentList(Object[] students) {
        super(students, Student.class);
    }
    
}
