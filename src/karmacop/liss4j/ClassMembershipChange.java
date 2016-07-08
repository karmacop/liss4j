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

import java.util.Date;

/**
 *
 * @author Glenn Tester
 */
public class ClassMembershipChange extends LissGeneric {

    public ClassMembershipChange() {
        super();
    }

    public ClassMembershipChange(String studentId, Date date,
            ClassList outOfClasses, ClassList intoClasses) {
        this.put("studentId", studentId);
        this.put("date", date);
        this.put("outOfClasses", outOfClasses);
        this.put("intoClasses", intoClasses);
    }

    public String getStudentId() {
        return (String) this.get("studentId");
    }

    public void setStudentId(String studentId) {
        this.put("studentId", studentId);
    }

    public Date getDate() {
        return (Date) this.get("date");
    }

    public void setDate(Date date) {
        this.put("date", date);
    }

    public ClassList getOutOfClasses() {
        return (ClassList) this.get("outOfClasses");
    }

    public void setOutOfClasses(ClassList outOfClasses) {
        this.put("outOfClasses", outOfClasses);
    }

    public ClassList getIntoClasses() {
        return (ClassList) this.get("intoClasses");
    }

    public void setIntoClasses(ClassList intoClasses) {
        this.put("intoClasses", intoClasses);
    }
    
    
}
