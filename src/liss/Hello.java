/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

import java.util.HashMap;

/**
 *
 * @author Glenn Tester
 */
public class Hello extends LissGeneric {

    /**
     * 
     */
    public Hello() {
        super();
    }
    
    /**
     * 
     * @param map 
     */
    public Hello(HashMap<String,Object> map) {
        super(map);
    }

    /**
     * 
     * @param SIS
     * @param LissVersion 
     */
    public Hello(String SIS, int LissVersion) {
        this.put("SIS", SIS);
        this.put("LissVersion", LissVersion);
    }
    
    /**
     * 
     * @param sis 
     */
    public void setSis(String sis) {
        this.put("SIS", sis);
    }
    
    /**
     * 
     * @return 
     */
    public String getSis() {
        return (String) this.get("SIS");
    }

    /**
     * 
     * @param lissVersion 
     */
    public void setLissVersion(int lissVersion) {
        this.put("LissVersion", lissVersion);
    }
    
    /**
     * 
     * @return 
     */
    public int getLissVersion() {
        return (int) this.get("LissVersion");
    }
}
