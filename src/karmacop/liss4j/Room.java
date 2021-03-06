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
public class Room extends LissGeneric {
    
    static final public String ROOM_ID = "RoomId";
    static final public String ROOM_CODE = "RoomCode";
    static final public String NAME = "Name";
    static final public String CAPACITY = "Capacity";
    static final public String CAMPUS = "Campus";

    public Room() {
        super();
    }
    
        public Room(String RoomId, String RoomCode, 
                String Name, int Capacity, 
                String Campus) {
            this.put("RoomId", String.format("%1$20s", RoomId) );
            this.put("RoomCode", String.format("%1$20s", RoomCode) );
            this.put("Name", Name);
            this.put("Capacity", Capacity);
            this.put("Campus", Campus);
        }
        
    public void setRoomId(String roomId) {
        this.put(ROOM_ID, String.format("%1$20s", roomId) );
    }
    
    public String getRoomId() {
        return (String) this.get(ROOM_ID);
    }
    
    public void setRoomCode(String roomCode) {
        this.put(ROOM_CODE, String.format("%1$20s", roomCode) );
    }
    
    public String getRoomCode() {
        return (String) this.get(ROOM_CODE);
    }
    
    public void setName(String name) {
        this.put(NAME, name );
    }
    
    public String getName() {
        return (String) this.get(NAME);
    }
    
    public void setCapacity(int capacity) {
        this.put(CAPACITY, capacity );
    }
    
    public int getCapacity() {
        return (int) this.get(CAPACITY);
    }
    
    public void setCampus(String campus) {
        this.put(CAMPUS, campus );
    }
    
    public String getCampus() {
        return (String) this.get(CAMPUS);
    }
}
