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
public class BellTime extends LissGeneric {

    static final public String DAY_NUMBER = "DayNumber";
    static final public String DAY_NAME = "DayName";
    static final public String PERIOD = "Period";
    static final public String START_TIME = "StartTime";
    static final public String END_TIME = "EndTime";
    static final public String TYPE = "Type";
    
    public BellTime() {
        super();
    }
    
    public BellTime(int DayNumber, String DayName, 
                String Period, String StartTime, 
                String EndTime, String Type) {
            this.put("DayNumber", DayNumber);
            this.put("DayName", DayName);
            this.put("Period", Period);
            this.put("StartTime", StartTime);//HH:MM
            this.put("EndTime", EndTime);
            this.put("Type", Type);
        }
        
    public void setDayNumber(int dayNumber) {
        this.put(DAY_NUMBER, dayNumber );
    }
    
    public int getDayNumber() {
        return (int) this.get(DAY_NUMBER);
    } 
    
    public void setDayName(String dayName) {
        this.put(DAY_NAME, dayName );
    }
        
    public String getDayName() {
        return (String) this.get(DAY_NAME);
    } 
    
    public void setPeriod(String string) {
        this.put(PERIOD, string );
    }
    
    public String getPeriod() {
        return (String) this.get(PERIOD);
    } 
    
    /**
     * 
     * @param string 
     */
    public void setStartTime(String string) {
        this.put(START_TIME, string );
    }
    
    public String getStartTime() {
        return (String) this.get(START_TIME);
    } 
    
    public void setEndTime(String string) {
        this.put(END_TIME, string );
    }
    
    public String getEndTime() {
        return (String) this.get(END_TIME);
    } 
    
    public void setType(String string) {
        this.put(TYPE, string );
    }
    
    public String getType() {
        return (String) this.get(TYPE);
    }
}