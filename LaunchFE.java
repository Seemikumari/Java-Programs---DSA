import java.util.*;
import java.util.function.*;
public class LaunchFE {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(2);
//        list.add(4);
//        list.add(5);
//        list.add(8);
//        list.add(9);
//        System.out.println(list);

        List<Integer> list1=Arrays.asList(2,4,5,8,9);
//        for(Object o:list1){
//            System.out.println(o);
//       }
        //we can also iterate it as
//        for(Integer o:list1){
//            System.out.println(o);
//        }

        list1.forEach(n->System.out.println(n));
        System.out.println("************************************************************************");
                //implementation of inbuilt consumer functional interface
        //for each method can only be used with functional interface
        //for each method just provide us the implementation of in-build functional interface

//        Consumer<Integer>  cons = new Consumer<Integer>(){
//            public void accept(Integer i){
//                System.out.println(i);
//            }
//
//        };
//        list1.forEach(cons);
        //this can also be done as follows

      //  Consumer<Integer> cons=i-> System.out.println(i);
        list1.forEach(i->System.out.println(i));
    }
}
