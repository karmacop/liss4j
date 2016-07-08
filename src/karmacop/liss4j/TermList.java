/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class TermList extends LissGenericList<Term> {
    
    public TermList() {
        super();
    }
    
    public TermList(Term[] terms) {
        super(terms,Term.class);
    }

}