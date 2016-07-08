/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
