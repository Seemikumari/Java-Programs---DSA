import java.util.*;
public class LaunchITR {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("ARMY");
        a1.add(1);
        a1.add("java");
        a1.add(100);
        System.out.println(a1);

        //for loop
        //for(int i = 0; i <a1.size();i++){
//            Object o=a1.get(i);
//            System.out.println(o);
          //  System.out.println(a1.get(i));
        //}

        //for each loop
//       for(Object o :a1){
//           System.out.println(o);
//       }
        //iterator purpose is to fetch the data from the collection
       Iterator itr1=  a1.iterator();
        while(itr1.hasNext()){
            //Object o=itr1.next();
            //Integer i=(Integer)itr1.next(); //we can  also fetch the data in specified format by downcasting it in any format
            System.out.println(itr1.next());

        }
        ListIterator listr=a1.listIterator(a1.size());
        //using list iterator we can traverse in reverse direction also
        //we can add the collection to other collection as well
        while(listr.hasPrevious()){
            System.out.println(listr.previous());
        }

        
    }
}
