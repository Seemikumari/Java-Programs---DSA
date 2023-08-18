class A2{
    public void show(){
        System.out.println("in A2 show");
    }
    //class B2{   //example of inner class/member inner class
    static class B2{      //another example of inner class which is static
        public void display (){
            System.out.println(" in display");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.show();
       // A2.B2 obj1 = obj.new B2();  //to create the object of b we need the object of a
        A2.B2 obj1 = new A2.B2(); //to access the static type of inner class we don't need object reference rather we need class reference
        obj1.display();

    }
}
