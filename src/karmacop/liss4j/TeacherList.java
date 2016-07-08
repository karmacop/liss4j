/* 
 * Copyright (C) 2016 Glenn Tester.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
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
