class Human{  //parent class //super class//base class : a class from where other classes are getting inherited
    int age;
    void sleep(){
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Students extends Human {  // child class//subclass//derived class: a class which is taking someone else property and behaviour

}
public class Inheritance {
    public static void main(String[] args) {
        Students st = new Students();
        st.sleep();

    }
}
