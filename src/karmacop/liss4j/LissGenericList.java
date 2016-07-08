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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Glenn Tester
 * @param <T>
 */
public class LissGenericList<T extends LissGeneric> extends ArrayList<T> {
    public LissGenericList() {
        super();
    }

    /**
     * 
     * @param objects
     * @param c 
     */
    public LissGenericList(Object[] objects, Class<T> c) {
        this();
        for (Object object : objects) {
            T element;
            try {
                element = c.newInstance();
                element.putAll( (HashMap) object );
                this.add(element);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(karmacop.liss4j.Util.LOG_NAME).log(Level.SEVERE, "Could not create prepopulated list.{1}", ex.getStackTrace());
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T thi : this) {
            sb.append(thi.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
