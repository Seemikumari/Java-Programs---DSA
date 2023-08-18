interface Car{
    void drive();
}
//class WagonR implements Car{
//    public void drive(){
//        System.out.println("Driving....");
//    }
//}
public class AnnoyDemo {
    public static void main(String[] args) {
        // Car obj = new WagonR();
       // Car obj = new Car();   //at this point we can't do that because car is an interface and as interface do not have any implementation as it's  methods are not defined
        //Now, what we can do is let's define a car
        Car obj = new Car()
        {
           public void drive(){
            System.out.println("Driving....");
        }
        };
        //so basically what we did here is we created a class inside a class and since this class has no name so we call it Annonymos Inner Class
        // the only drawback is that we can only use this concept once like we can not create further objects from this class
       // Car obj1 = new Car();   -> this won't work
         obj.drive();
    }
}
