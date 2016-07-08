/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karmacop.liss4j;

/**
 *
 * @author Glenn Tester
 */
public class ClassMembershipList extends LissGenericList<ClassMembership> {

    public ClassMembershipList() {
        super();
    }

    public ClassMembershipList(ClassMembership[] classMemberships) {
        super(classMemberships, ClassMembership.class);
    }

}
