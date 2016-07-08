/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Glenn Tester
 */
public class Timetable extends LissGeneric {

    static final public String PERIOD = "Period";
    static final public String CLASS_CODE = "ClassCode";
    static final public String TEACHER_IDS = "TeacherIds";
    static final public String ROOM_ID = "RoomId";
    static final public String ROOM_CODE = "RoomCode";
    static final public String TT_STRUCTURE = "TtStructure";
    
    public Timetable() {
        super();
    }
    
        public Timetable(String period, 
                String classCode, String teacherId, 
                String roomId, String roomCode, 
                String ttStructure) {
            this.put(PERIOD, String.format("%1$20s", period));
            this.put(CLASS_CODE, String.format("%1$20s", classCode));
            this.put(TEACHER_IDS, String.format("%1$20s", teacherId));
            this.put(ROOM_ID, roomId);
            this.put(ROOM_CODE, roomCode);
            this.put(TT_STRUCTURE, ttStructure);
        }
    
    public void setPeriod(String period) {
        this.put(PERIOD, String.format("%1$20s", period) );
    }
    
    public String getPeriod() {
        return (String) this.get(PERIOD);
    }
    
    public void setClassCode(String classCode) {
        this.put(CLASS_CODE, String.format("%1$20s", classCode) );
    }
    
    public String getClassCode() {
        return (String) this.get(CLASS_CODE);
    }
    
    public void setTeacherIDs(String teacherIds) {
        this.put(TEACHER_IDS, String.format("%1$20s", teacherIds) );
    }
    
    
    public String getTeacherIds() {
        return (String) this.get(TEACHER_IDS);
    }
    
    public ArrayList<String> getTeacherIdsArray() {
        ArrayList<String> returnList = new ArrayList<>();
        returnList.addAll(
            Arrays.asList(((String) this.get(TEACHER_IDS )).split(","))
        );
        return returnList;
    }
    
    public void setRoomId(String roomId) {
        this.put(ROOM_ID, roomId );
    }
    
    public String getRoomId() {
        return (String) this.get(ROOM_ID);
    }
    
    public void setRoomCode(String roomCode) {
        this.put(ROOM_CODE, roomCode );
    }
    
    public String getRoomCode() {
        return (String) this.get(ROOM_CODE);
    }
    
    public void setTtStructure(String ttStructure) {
        this.put(TT_STRUCTURE, ttStructure );
    }
    
    public String getTtStructure() {
        return (String) this.get(TT_STRUCTURE);
    }
}