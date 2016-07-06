/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class CourseClassList extends LissGenericList<CourseClass> {
    
    public CourseClassList() {
        super();
    }
    
    public CourseClassList(CourseClass[] objects) {
        super(objects,CourseClass.class);
    }
    
    public CourseClass getCourseClassFromClassCode(String string){
        for (CourseClass courseClass : this) {
            if(string.equalsIgnoreCase( courseClass.getClassCode() ) ) {
                return courseClass;
            }
        }
        return null;
    }
    
}