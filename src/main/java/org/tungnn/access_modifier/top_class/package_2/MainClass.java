package org.tungnn.access_modifier.top_class.package_2;

//import org.tungnn.access_modifier.top_class.package_1.DefaultClass;
import org.tungnn.access_modifier.top_class.package_1.PublicClass;

public class MainClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
//        DefaultClass defaultClass = new DefaultClass(); // Cannot use DefaultClass in another package.

        System.out.println(publicClass);
//        System.out.println(defaultClass);
    }
}
