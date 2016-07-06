/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class TeacherList extends LissGenericList<Teacher> {
    
    public TeacherList() {
        super();
    }
    
    public TeacherList(Object[] objects) {
        super(objects,Teacher.class);
    }
    
    public Teacher getTeacherFromLastCommaFirstName(String string){
        for (Teacher teacher : this) {
            if(string.equalsIgnoreCase( (teacher.getSurname()+","+teacher.getFirstName()).toLowerCase() )) {
                return teacher;
            }
        }
        return null;
    }
    
    public Teacher getTeacherFromTeacherId(String string){
        for (Teacher teacher : this) {
            if(string.equalsIgnoreCase( teacher.getTeacherID() ) ) {
                return teacher;
            }
        }
        return null;
    }
    
    public Teacher getTeacherFromTeacherCode(String string){
        for (Teacher teacher : this) {
            if(string.equalsIgnoreCase( teacher.getTeacherCode() ) ) {
                return teacher;
            }
        }
        return null;
    }
}
