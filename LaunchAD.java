import java.util.*;
public class LaunchAD {
    public static void main(String[] args) {
        ArrayDeque ad1= new ArrayDeque();
        ad1.add(10);
        ad1.add(20);
        ad1.add(20);
        ad1.add("Army");
        System.out.println(ad1);
        ad1.addFirst(100);
        ad1.addLast(200);
        System.out.println(ad1);

        ad1.offer(500);
        ad1.offerFirst(1);
        ad1.offerLast(10);
        //This offer method is acting like an add method but the only possibility is that it may not get add in the collection that is
        //in offer method there is high possibility that element may not get added to collection

        System.out.println(ad1);
    }
}
