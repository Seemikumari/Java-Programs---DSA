//Handling vs Ducking...
class DemoA{
    public void a() throws Exception{
        System.out.println(" in a");
        int value = 9;
        b();   //---> calling method b

    }
    public void b() throws Exception{
        int num1 = 9;
        int num2 = 0;

            int result = num1 / num2;
        }

}
public class ExceptionHandling3 {
    public static void main(String[] args) {
        DemoA obj = new DemoA();
        try {
            obj.a();
        }
        catch(Exception e ){
            System.out.println("Error"+e.getMessage());
        }
    }
}
