/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class CourseClassList extends LissGenericList<CourseClass> {
    
    public CourseClassList() {
        super();
    }
    
    public CourseClassList(CourseClass[] courseClasses) {
        super(courseClasses,CourseClass.class);
    }
    
    public CourseClass getCourseClassFromClassCode(String classCode){
        for (CourseClass courseClass : this) {
            if(classCode.equals( courseClass.getClassCode() ) ) {
                return courseClass;
            }
        }
        return null;
    }
    
}