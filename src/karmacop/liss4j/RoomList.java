/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class RoomList extends LissGenericList<Room> {
    
    public RoomList() {
        super();
    }
    
    public RoomList(Object[] rooms) {
        super(rooms,Room.class);
    }
    
    public Room getRoomFromRoomId(String roomId){
        for (Room room : this) {
            if(roomId.equals( room.getRoomId() ) ) {
                return room;
            }
        }
        return null;
    }
    
    public Room getRoomFromRoomCode(String roomCode){
        for (Room room : this) {
            if(roomCode.equals( room.getRoomCode() ) ) {
                return room;
            }
        }
        return null;
    }
}