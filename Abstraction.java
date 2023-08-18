abstract class AeroPlane4{
    abstract public void takeoff();
    abstract public void fly();
    public void landing(){     //this method doesn't come under pure abstraction
        System.out.println("AeroPlane is landing");
    }


}
class CargoPlane4 extends AeroPlane4{
    public void takeoff(){
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane flies at lower height");
    }
    public void alert(){
        System.out.println("Alert....");    //Specialized class
    }
}


class PassengerPlane4 extends AeroPlane4 {
    public void takeoff(){
        System.out.println("PassengerPlane requires medium runway");
    }
    public void fly(){
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class Abstraction {
    public static void main(String[] args) {
       AeroPlane4 ref1 = new CargoPlane4();  //here I have created parent type reference
       ref1.fly();
       ref1.takeoff();
       ref1.landing();
       ((CargoPlane4) ref1).alert();  //DOWNCASTING

       AeroPlane4 ref2= new PassengerPlane4();
       ref2.fly();
       ref2.takeoff();
       ref2.landing();
       

       }
    }

