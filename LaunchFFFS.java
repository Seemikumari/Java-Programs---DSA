import java.util.*;
import java.util.concurrent.*;
public class LaunchFFFS {
    public static void main(String[] args) {
        ArrayList ar1 = new ArrayList();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(40);
        System.out.println(ar1);
//        for(int i =0; i <ar1.size();i++){
//            System.out.println(ar1.get(i));
//            ar1.add(100);//this will give the output in infinite
            //this way is called concurrent modification or structural modification
            //while accessing the data we are doing the modification


        //FailFast
//            Iterator itr= ar1.iterator();
//            while (itr.hasNext()) {
//                System.out.println(itr.next());
//                ar1.add(100); //will give an exception
                //while accessing then elements through iterator process and then performing structural modification on it will lead to exception ot abnormal termination
           // }

        //FAILSAFE

        CopyOnWriteArrayList ar2 = new CopyOnWriteArrayList();
        ar2.add(10);
        ar2.add(20);
        ar2.add(30);
        ar2.add(40);
        System.out.println(ar2);

        Iterator itr1= ar2.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            ar2.add(100);
            System.out.println(ar2);

        }
    }
}
