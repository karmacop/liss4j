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
    
    public TeacherList(Object[] teachers) {
        super(teachers,Teacher.class);
    }
    
    public Teacher getTeacherFromLastCommaFirstName(String string){
        for (Teacher teacher : this) {
            if(string.equalsIgnoreCase( (teacher.getSurname()+","+teacher.getFirstName()).toLowerCase() )) {
                return teacher;
            }
        }
        return null;
    }
    
    public Teacher getTeacherFromTeacherId(String teacherId){
        for (Teacher teacher : this) {
            if(teacherId.equals( teacher.getTeacherID() ) ) {
                return teacher;
            }
        }
        return null;
    }
    
    public Teacher getTeacherFromTeacherCode(String teacherCode){
        for (Teacher teacher : this) {
            if(teacherCode.equalsIgnoreCase( teacher.getTeacherCode() ) ) {
                return teacher;
            }
        }
        return null;
    }
}
