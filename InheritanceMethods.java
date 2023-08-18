class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane{
    public void fly(){
        System.out.println("Cargo plane flies at lower height");
    }
    public void carryGoods(){
        System.out.println("cargo plane carry goods");
    }
}
class PassengerPlane extends Aeroplane{
    public void fly(){
        System.out.println("passenger plane flies at medium height");
    }
    public void carryPassengers(){
        System.out.println("passenger planes carry passenger");
    }
}
public class InheritanceMethods {
    public static void main(String[] args) {
        CargoPlane cg= new CargoPlane();
        cg.takeoff();  //inherited method
        cg.fly();  //overridden method

        PassengerPlane pg = new PassengerPlane();
        pg.takeoff();
        pg.fly();

    }
}
