/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author MHS
 */
public class BellTimeList extends LissGenericList<BellTime> {
    
    public BellTimeList() {
        super();
    }
    
    public BellTimeList(BellTime[] bellTimes) {
        super(bellTimes,BellTime.class);
    }
    
}
