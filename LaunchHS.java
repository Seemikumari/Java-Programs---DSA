import java.util.*;
public class LaunchHS {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(44);
        System.out.println(hs);//it follows hashtable behind the scene

        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(44);
        System.out.println(hs1);//it follows both hashtable and linked list
        //because of which the order of insertion is maintained

        //duplicates are not allowed


    }
}
