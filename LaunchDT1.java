//import java.util.Date;
public class LaunchDT1 {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date(); //used for any utility we want to do in java operation
        System.out.println(dt);

        long timeInMs = dt.getTime();

        java.sql.Date dt1= new java.sql.Date(timeInMs); //used in DB operation
        System.out.println(dt1);

    }
}
