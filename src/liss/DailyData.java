/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Glenn Tester
 */
public class DailyData extends LissGeneric {

    public DailyData() {
        super();
    }

        public DailyData(Date date, String Period, 
                String StartTime, String EndTime, 
                String ClassCode, String ClassName, 
                String Type, String TeacherIds, 
                String TeacherCodes, String Rooms, 
                String Students) {
            this.put("Date", date);
            this.put("Period", Period);
            this.put("StartTime", StartTime);
            this.put("EndTime", EndTime);
            this.put("ClassCode", String.format("%1$20s", ClassCode) );
            this.put("ClassName", ClassName);
            this.put("Type", Type);
            this.put("TeacherIds", TeacherIds);
            this.put("TeacherCodes", TeacherCodes);
            this.put("Rooms", Rooms);
            this.put("Students", Students);
        }
}