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
 * @author MHS
 */
public class Util {
    
    final public static String LOG_NAME = "Liss4j";

    public static enum BellType {
        T('T', "Teaching period"),
        L('L', "recess or lunch"),
        O('O', "Out-of-timetable teaching period, i.e. before-school or after-school"),
        R('R', "Roll-call"),
        S('S', "Sport"),
        X('X', "Other");
        private final char value;
        private final String description;

        private BellType(char value, String description) {
            this.value = value;
            this.description = description;
        }

        public char getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("BellType")
                    .append("{value=").append(value)
                    .append(", description='").append(description)
                    .append('}');
            return sb.toString();
        }
    }

    public static enum Gender {

        M('M', "Male"),
        F('F', "Female");
        private final char value;
        private final String description;

        private Gender(char value, String description) {
            this.value = value;
            this.description = description;
        }

        public char getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Gender")
                    .append("{value=").append(value)
                    .append(", description='").append(description)
                    .append('}');
            return sb.toString();
        }
    }

    public static enum Day {

        Mon("Mon", "Monday"),
        Tue("Tue", "Tuesday"),
        Wed("Wed", "Wednesday"),
        Thu("Thu", "Thursday"),
        Fri("Fri", "Friday");
        private final String shortName;
        private final String longName;

        private Day(String shortName, String longName) {
            this.shortName = shortName;
            this.longName = longName;
        }

        public String getShortName() {
            return shortName;
        }

        public String getLongName() {
            return longName;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Day")
                    .append("{shortName=").append(shortName)
                    .append(", longName='").append(longName)
                    .append('}');
            return sb.toString();
        }
    }

    public static enum ClassType {
        Class("Class", "A normal teaching class"),
        Duty("Duty", "A yard duty or other duty"),
        Study("Study", "A study period, (for students with gaps in their timetable)"),
        RollClass("RollClass", "Also known as HomeGroup, RollCall, etc"),
        RTO("RTO", "Rostered Time Off"),
        StaffMeeting("StaffMeeting", "Staff meeting"),
        ExtraCurricular("ExtraCurricular", "e.g. sports"),
        OnCall("OnCall", "On-call period (the teacher is free on this period unless they take a cover, and they’re encouraged to take covers during their on-call periods)");

        private final String value;
        private final String description;

        private ClassType(String value, String description) {
            this.value = value;
            this.description = description;
        }

        public String getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassType")
                    .append("{value=").append(value)
                    .append(", description='").append(description)
                    .append('}');
            return sb.toString();
        }
    }

    public static enum DailyDataType {
        Class("Class", "A normal teaching class"),
        Duty("Duty", "A yard duty or other duty"),
        Study("Study", "A study period, (for students with gaps in their timetable)"),
        RollClass("RollClass", "Also known as HomeGroup, RollCall, etc"),
        RTO("RTO", "Rostered Time Off"),
        StaffMeeting("StaffMeeting", "Staff meeting"),
        Excursion("Excursion", "Excursion"),
        Exam("Exam", "Exam"),
        Incursion("Incursion", "Incursion"),
        Event("Event", "any event which does not fall into the above categories");

        private final String value;
        private final String description;

        private DailyDataType(String value, String description) {
            this.value = value;
            this.description = description;
        }

        public String getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassType")
                    .append("{value=").append(value)
                    .append(", description='").append(description)
                    .append('}');
            return sb.toString();
        }
    }

}
