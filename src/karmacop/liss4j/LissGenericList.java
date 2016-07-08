/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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