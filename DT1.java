import java.util.Date;
public class DT1 {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);
        //or we can directly import in the body itself as follows
        //java.util.Date dt= new java.util.Date();

        long timeInMs=dt.getTime();
        java.sql.Date dt1= new java.sql.Date(timeInMs); //here in sql package we do not have zero parameterized constructor
        System.out.println(dt1);

        
    }
}
