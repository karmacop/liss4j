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
