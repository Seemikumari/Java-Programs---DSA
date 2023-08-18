interface  A{
   // int num =6;  //by default: public static final
    void show();
}
interface X {
    void abc();
}
class B  implements A,X {   //it is important to define all the methods of interfaces
    public void show(){
        System.out.println("in show ");
    }
    public void abc(){
        System.out.println("in abc");
    }
}
public class INterface {
    public static void main(String[] args) {
       // System.out.println(A.num);
     //   A obj = new B(); //implementation of interface
        B obj = new B();
        obj.show();
        obj.abc();

    }
}
