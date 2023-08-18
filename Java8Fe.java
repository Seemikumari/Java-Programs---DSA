interface A1{
    void show();
    default void config(){       //here in this case it is a non-static method
        System.out.println("in config");
    }
    static void abc(){
        System.out.println("in abc");
    }
}
class B1 implements A1{
    public void show(){
        System.out.println("in show");
    }
}
public class Java8Fe {
    public static void main(String[] args) {
       // A1.config();  //can not make static reference to a non-static method
        A1.abc();    //static method can be  called directly with the help of class name
        A1 obj = new B1();
        obj. config();
        obj.show();
    }
}
