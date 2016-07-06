/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class Room extends LissGeneric {

    public Room() {
        super();
    }
    
    /*public final static ArrayList<String> propertyList = new ArrayList<String>() {{
        add("RoomId");
        add("RoomCode");
        add("Name");
        add("Capacity");
        add("Campus");
    }};
    
    public final static LinkedHashMap<String, Class> properties = new LinkedHashMap<String, Class>() {{
        put("RoomId", String.class);
        put("RoomCode", String.class);
        put("Name", String.class);
        put("Capacity", Integer.class);
        put("Campus", String.class);
    }};*/
    
        public Room(String RoomId, String RoomCode, 
                String Name, int Capacity, 
                String Campus) {
            this.put("RoomId", String.format("%1$20s", RoomId.trim()).trim() );
            this.put("RoomCode", String.format("%1$20s", RoomCode.trim()).trim() );
            this.put("Name", Name);
            this.put("Capacity", Capacity);
            this.put("Campus", Campus);
        }
        
    public void setRoomId(String string) {
        this.put("RoomId", String.format("%1$20s", string.trim()).trim() );
    }
    
    public String getRoomId() {
        return (String) this.get("RoomId" );
    }
    
    public void setRoomCode(String string) {
        this.put("RoomCode", String.format("%1$20s", string.trim()).trim() );
    }
    
    public String getRoomCode() {
        return (String) this.get("RoomCode" );
    }
    
    public void setName(String string) {
        this.put("Name", string.trim() );
    }
    
    public String getName() {
        return (String) this.get("Name" );
    }
    
    public void setCapacity(int i) {
        this.put("Capacity", i );
    }
    
    public int getCapacity() {
        return (int) this.get("Capacity" );
    }
    
    public void setCampus(String string) {
        this.put("Campus", string.trim() );
    }
    
    public String getCampus() {
        return (String) this.get("Campus" );
    }
}
