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

import java.util.HashMap;

/**
 *
 * @author Glenn Tester
 */
public class Hello extends LissGeneric {
    
    static final public String SIS = "SIS";
    static final public String LISS_VERSION = "LissVersion";

    /**
     * 
     */
    public Hello() {
        super();
    }

    /**
     * 
     * @param sis
     * @param lissVersion 
     */
    public Hello(String sis, int lissVersion) {
        this.put(SIS, sis);
        this.put(LISS_VERSION, lissVersion);
    }
    
    /**
     * 
     * @param sis 
     */
    public void setSis(String sis) {
        this.put(SIS, sis);
    }
    
    /**
     * 
     * @return 
     */
    public String getSis() {
        return (String) this.get(SIS);
    }

    /**
     * 
     * @param lissVersion 
     */
    public void setLissVersion(int lissVersion) {
        this.put(LISS_VERSION, lissVersion);
    }
    
    /**
     * 
     * @return 
     */
    public int getLissVersion() {
        return (int) this.get(LISS_VERSION);
    }
}
