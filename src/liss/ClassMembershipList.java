/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class ClassMembershipList extends LissGenericList<ClassMembership> {

    public ClassMembershipList() {
        super();
    }

    public ClassMembershipList(ClassMembership[] objects) {
        super(objects, ClassMembership.class);
    }

}
