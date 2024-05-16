package org.tungnn.access_modifier.member.package_1;

public class MainClass {
    public static void main(String[] args) {
        OwnerClass ownerClass = new OwnerClass();

        System.out.println("Test in the same package.");
        ownerClass.testAccessModifierPublic();
        ownerClass.testAccessModifierProtected();
        ownerClass.testAccessModifierDefault();
    }
}
