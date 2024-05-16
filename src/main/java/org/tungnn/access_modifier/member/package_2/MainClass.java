package org.tungnn.access_modifier.member.package_2;

import org.tungnn.access_modifier.member.package_1.OwnerClass;

public class MainClass {
    public static void main(String[] args) {
        OwnerClass ownerClass = new OwnerClass();
        ChildClass childClass = new ChildClass();

        System.out.println("Test in another package.");
        ownerClass.testAccessModifierPublic();

        System.out.println();
        System.out.println("Test in another package. ChildClass: ");
        childClass.testAccessModifierPublic();
        /*
         * When child class override protected method. It can be accessed.
         * If not, protected method only be accessed inside child class by super keyword.
         */
        childClass.testAccessModifierProtected();
    }
}
