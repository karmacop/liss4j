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
public class Calendar extends LissGeneric {

    static final public String DATE = "Date";
    static final public String DAY_NAME = "DayName";
    static final public String DAY_NUMBER = "DayNumber";
    static final public String ROTATION = "Rotation";
    
    public Calendar() {
        super();
    }

    public Calendar(Date date, String DayName,
            int DayNumber, int Rotation) {
        this.put(DATE, date);
        this.put(DAY_NAME, DayName);
        this.put(DAY_NUMBER, DayNumber);
        this.put(ROTATION, Rotation);
    }

    public Date getDate() {
        return (Date) get(DATE);
    }

    public void setDate(Date date) {
        put(DATE, date);
    }

    public String getDayName() {
        return (String) get(DAY_NAME);
    }

    public void setDayName(String dayName) {
        put(DAY_NAME, dayName);
    }

    public int getDayNumber() {
        return (int) get(DAY_NUMBER);
    }

    public void setDayNumber(int dayNumber) {
        put(DAY_NUMBER, dayNumber);
    }

    public int getRotation() {
        return (int) get(ROTATION);
    }

    public void setRotation(int rotation) {
        put(ROTATION, rotation);
    }
}
