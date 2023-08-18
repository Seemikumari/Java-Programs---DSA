import java.util.*;
class Student11{
    private String name;
    private int id;
}
class Employee1{
    private String name;
    private int id;
}


public class Gen2 {
    public static void main(String[] args) {
        Student11 st1= new Student11();
        Student11 st2= new Student11();

        Employee1 e= new Employee1();

        ArrayList<Student11> al = new ArrayList<Student11>();
        al.add(st1);
       // al.add(e);
    }
}
