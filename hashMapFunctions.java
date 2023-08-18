import java.io.*;
import java.util.*;

public class hashMapFunctions {
    public static void main(String[] args) {
       HashMap<Integer, String> map = new HashMap<>();
       //put function: used to put the values in the hash table
        map.put(1,"Priya");
        map.put(2, "Pooja");
        map.put(7,"Shivam");
        map.put(18, "Seemi");
        System.out.println("hashmap of the given data is"+ map);

        //get() function: get the values with the help of keys
        String result= map.get(18);
        System.out.println("The value of given key is " +  result);

        //remove() function: remove the set from hash table
        map.remove(1);
        System.out.println("the updated hashmap is "+ map);

        //containsKry() function :helps to check weather key is present or not
     System.out.println(("Checking  of weather kry is present or not:"+map.containsKey(1)));

     //entrySet() function
     for(Map.Entry<Integer, String> ele:map.entrySet()){ //iterate using for loop
      System.out.println(ele.getKey()+ " :"+ ele.getValue());
     }

        }
}
