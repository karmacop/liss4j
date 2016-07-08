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
public class Authentication extends LissGeneric {

    static final public String SCHOOL = "School";
    static final public String USER_NAME = "UserName";
    static final public String PASSWORD = "Password";
    static final public String LISS_VERSION = "LissVersion";
    static final public String USER_AGENT = "UserAgent";

    public Authentication() {
        super();
    }

    public Authentication(String School, String UserName,
            String Password, int LissVersion,
            String UserAgent) {
        this.put(SCHOOL, School);
        this.put(USER_NAME, UserName);
        this.put(PASSWORD, Password);
        this.put(LISS_VERSION, LissVersion);
        this.put(USER_AGENT, UserAgent);
    }

    public String getSchool() {
        return (String) this.get(SCHOOL);
    }

    public void setSchool(String school) {
        this.put(SCHOOL, school);
    }

    public String getUserName() {
        return (String) this.get(USER_NAME);
    }

    public void setUserName(String userName) {
        this.put(USER_NAME, userName);
    }

    public String getPassword() {
        return (String) this.get(PASSWORD);
    }

    public void setPassword(String password) {
        this.put(PASSWORD, password);
    }

    public int getLissVersion() {
        return (int) this.get(LISS_VERSION);
    }

    public void setLissVersion(int lissVersion) {
        this.put(LISS_VERSION, lissVersion);
    }

    public String getUserAgent() {
        return (String) this.get(USER_AGENT);
    }

    public void setUserAgent(String userAgent) {
        this.put(USER_AGENT, userAgent);
    }

}
