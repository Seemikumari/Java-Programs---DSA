// final class Animal5{
//    void sleep(){
//        System.out.println("Animal is sleeping");
//    }
//}
class Animal5{
     final  int age =18;
   final  void sleep(){
        //age =18;  //final variable will behave as constant so that it's value can't be changed
        System.out.println("Animal is sleeping");
    }
}
class Tiger5 extends Animal5{
//    void sleep(){   // final method can not be overridden
//
//    }

}
public class FinalClass {
    public static void main(String[] args) {
      Tiger5 t5= new Tiger5();
      t5.sleep();
    }
}
