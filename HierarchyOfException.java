import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class HierarchyOfException {
    public static void main(String[] args) {
        //int result = 7 / 0;    //this throws an arithematic exception which is an unchecked exception
       // System.out.println(result);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try{
            str=br.readLine();
        }
        catch(IOException e){   //this throws an ioexceptions which is checked
            e.printStackTrace();
        }
        System.out.println(str);


    }
}
//Checked Exceptions are those exceptions that compiler will force you to handle
//Unchecked exceptions are those that compiler will force you to handle weather we want to handle it or not
//to know which exception is checked and which exception is unchecked we have to understand Hierarchy of Exceptions
//whenever there is -able at the end then in java these are interfaces
//Throwable is the only class that runs with able , so throwable extends objects
//Throwable has two class: Exception and Error
//when we check any class where superclass is runtime , so it is unchecked exception
//overall exceptions are checked
