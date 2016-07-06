/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

import java.util.HashMap;
import java.util.Map;

/**
 * Liss Generic is a wrapper around HashMap<String, Object> and doesn't do anything special.
 * 
 * @author Glenn Tester
 * 
 * 
 * 
 */
public class LissGeneric extends HashMap<String, Object>{
    
    /**
     * Creates an empty LissGeneric.
     */
    public LissGeneric() {
        super();
    }
    
    /**
     *
     * @param map
     * 
     * Takes a map and puts all items into a new LissGeneric.
     * 
     */
    public LissGeneric(Map<String,Object> map) {
        this();
        putAll(map);
    }
}
