/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author MHS
 */
public class TermList extends LissGenericList<Term> {
    
    public TermList() {
        super();
    }
    
    public TermList(Term[] objects) {
        super(objects,Term.class);
    }

}