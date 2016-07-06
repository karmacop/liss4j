/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class TimetableStructureList extends LissGenericList<TimetableStructure> {
    
    public TimetableStructureList() {
        super();
    }
    
    public TimetableStructureList(TimetableStructure[] timetableStructures) {
        super(timetableStructures,TimetableStructure.class);
    }
}
