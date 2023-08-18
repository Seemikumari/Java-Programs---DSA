import java.util.*;
public class LaunchCol {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(25);
        al.add(75);
        al.add(125);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        System.out.println("*********************************************************");

        ArrayList <String> al1 = new ArrayList<String>();
        al1.add("Seemi");
        al1.add("Shivam");
        al1.add("Shibu");
        al1.add("Kittu");
        al1.add("Raj");
        System.out.println(al1);

        Collections.sort(al1);
        System.out.println(al1);

        System.out.println("*****************************************************************************************");

        ArrayList  al2 = new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        System.out.println(al2);
     //to perform binary search data need to be in sorted order
       int index=  Collections.binarySearch(al2,30);
        System.out.println("Index is" +index);

        Collections.rotate(al2,2);
        System.out.println(al2);

        Collections.shuffle(al2);
        System.out.println(al2);

        System.out.println(Collections.frequency(al2,20));

        }
    }


