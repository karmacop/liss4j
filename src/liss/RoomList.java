/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class RoomList extends LissGenericList<Room> {
    
    public RoomList() {
        super();
    }
    
    public RoomList(Object[] objects) {
        super(objects,Room.class);
    }
    
    public Room getRoomFromRoomId(String string){
        for (Room room : this) {
            if(string.equalsIgnoreCase( room.getRoomId() ) ) {
                return room;
            }
        }
        return null;
    }
    
    public Room getRoomFromRoomCode(String string){
        for (Room room : this) {
            if(string.equalsIgnoreCase( room.getRoomCode() ) ) {
                return room;
            }
        }
        return null;
    }
}