class Human1{
    private String name;
    int age;
    Human1(){
        System.out.println("Human class constructor");
    }
    void sleep(){
        age=18;
        System.out.println("I like sleeping");
        System.out.println(age);
    }
}
class StudentA extends Human1 {
    //we know that by default the compiler will create a default constructor
    //public StudentA(){
    // super() --> by default it will have super method which calls the constructor of parent class
    //}
    void disp(){
        System.out.println("The age is :" + age);
      //  System.out.println("The name is :" + name) This won't be inherited as the private memebers of parent class won't participate in inheritance
    }

}
public class Inheritance2 {
    public static void main(String[] args) {
        StudentA st1 = new StudentA();
        st1.sleep();
        st1.disp();

    }
}
