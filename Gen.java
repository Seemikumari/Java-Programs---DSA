import java.util.*;
public class Gen {
    public static void main(String[] args) {
//        String ar[]=new String[10];
//        ar[0]="Hyder";
//        ar[1]="Teacher";
        //ar[2]=10; CE we are adding other type of data apart from string

//        String name= ar[0];
//        String name2 = ar[1];

        //No type safety
        ArrayList <String>al = new ArrayList<String>(); //it is dynamic
        al.add("Seemi");
        al.add("Shivam");
        //al.add(18); //here in case of array list we can add both values

//        String n1 = (String)al.get(0); //typecasting
//        String n2 = (String)al.get(1);
//        String n3 = (String)al.get(2);

        String name = al.get(0); //typecasting
        String name1 = al.get(1);
        System.out.println(name);
        System.out.println(name1);

    }
}
