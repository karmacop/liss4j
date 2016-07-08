/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

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
    
    public Teacher getTeacherFromLastCommaFirstName(String teacherName){
        for (Teacher teacher : this) {
            if(teacherName.equals( (teacher.getSurname()+","+teacher.getFirstName()).toLowerCase() )) {
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
            if(teacherCode.equals( teacher.getTeacherCode() ) ) {
                return teacher;
            }
        }
        return null;
    }
}