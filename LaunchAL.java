import java.util.*;
public class LaunchAL {
    public static void main(String[] args) {
        ArrayList al1= new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("Amazone");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);

        System.out.println(al2);
        al2.add(100);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();

        al3.add(1);
        al3.add(2);
        al3.add(4);
        System.out.println(al3);

        al3.addAll(al2);


    }
}
