import java.util.*;
public class LaunchLL {
    public static void main(String[] args) {
        //LinkedList is a class is java which is a  part of collection framework in java which is implementing two interfaces one is list and other is dequque
        LinkedList ll=new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        System.out.println(ll);
        //linked list can store homogeneous type of data

        System.out.println("**********************************************");

        LinkedList l2= new LinkedList();
        l2.add("Army");
        l2.add('S');
        l2.add(3);
        System.out.println(l2);
        //linked list can store heterogeneous type of data

        System.out.println("****************************************************");

        LinkedList l3 = new LinkedList();
        l3.add(10);
        l3.add(20);
        l3.add(30);
        System.out.println(l3);

        l3.addFirst("Army");
        l3.addLast("Amazone");

        System.out.println(l3);
        //let's try to add an object at 2nd index
        l3.add(2,"Shivam");
        System.out.println(l3);

        System.out.println(l3.peek());
        System.out.println(l3);
        //this peek method will fetch the first object of the collection without affecting it

        System.out.println(l3.poll());
        System.out.println(l3);
        //this method will also return the first object of the collection and remove it from collection

       //List l4 = new LinkedList();
       //we can aslo access it using the parent reference
        //but by this linkedlist will only be able to implement the methods that it has inherited using list we can't use those methods which linked list has inherited using dequeue

        //same happens if I will create dequeue type of reference
        //Deque l5= new  LinkedList();

        System.out.println(l3.get(2));
        System.out.println(l3.indexOf(30));
        System.out.println(l2.getFirst());
        System.out.println(l2.getLast());
    }
}
