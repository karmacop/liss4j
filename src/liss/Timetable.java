/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author MHS
 */
public class Timetable extends LissGeneric {

    public Timetable() {
    }
        
    

        public Timetable(String Period, 
                String ClassCode, String TeacherId, 
                String RoomId, String RoomCode, 
                String TtStructure) {
            this.put("Period", String.format("%1$20s", Period.trim()).trim());
            this.put("ClassCode", String.format("%1$20s", ClassCode.trim() ).trim());
            this.put("TeacherIds", String.format("%1$20s", TeacherId.trim() ).trim());
            this.put("RoomId", RoomId);
            this.put("RoomCode", RoomCode);
            this.put("TtStructure", TtStructure);
        }
    
    public void setPeriod(String string) {
        this.put("Period", String.format("%1$20s", string.trim()).trim() );
    }
    
    public String getPeriod() {
        return (String) this.get("Period" );
    }
    
    public int getDayNumber() {
        return (int) this.get("DayNumber" );
    }
    
    public void setDayNumber(int dayNumber) {
        this.put("DayNumber", dayNumber );
    }
    
    public Date getDate() {
        return (Date) this.get("Date" );
    }
    
    public void setDate(Date date) {
        this.put("Date", date );
    }
    
    public void setClassCode(String string) {
        this.put("ClassCode", String.format("%1$20s", string.trim()).trim() );
    }
    
    public String getClassCode() {
        return (String) this.get("ClassCode" );
    }
    
    public void setTeacherIDs(String string) {
        this.put("TeacherId", String.format("%1$20s", string.trim()).trim() );
    }
    
    
    public String getTeacherIDsString() {
        return (String) this.get("TeacherIds" );
    }
    
    public ArrayList<String> getTeacherIDs() {
        ArrayList<String> returnList = new ArrayList<>();
        returnList.addAll(
            Arrays.asList(((String) this.get("TeacherIds" )).split(","))
        );
        return returnList;
    }
    
    public String getTeacherCodesString() {
        return (String) this.get("TeacherCodes" );
    }
    
    public ArrayList<String> getTeacherCodes() {
        ArrayList<String> returnList = new ArrayList<>();
        returnList.addAll(
            Arrays.asList(((String) this.get("TeacherCodes" )).split(","))
        );
        return returnList;
    }
    
    public void setRoomId(String string) {
        this.put("RoomId", string );
    }
    
    public String getRoomId() {
        return (String) this.get("RoomId" );
    }
    
    public void setRoomCode(String string) {
        this.put("RoomCode", string );
    }
    
    public String getRoomCode() {
        return (String) this.get("RoomCode" );
    }
    
    public void setTtStructure(String string) {
        this.put("TtStructure", string );
    }
    
    public String getTtStructure() {
        return (String) this.get("TtStructure" );
    }
}