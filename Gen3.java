import java.util.*;
 class Gen5<T>{
      T obj;
      public Gen5(T obj){
          this.obj=obj;
      }
      void disp(){
          System.out.println("The type of data is: "+ obj.getClass().getName());
      }
      public T getObj(){
          return obj;
      }

}
public class Gen3 {
    public static void main(String[] args) {

        Gen5 <Integer> g = new Gen5<Integer>(10);
        g.disp();
        System.out.println(g.getObj());

        System.out.println("***************************************");

        Gen5 <String> g1 = new Gen5<String>("Raj");
        g1.disp();
        System.out.println(g1.getObj());

      //  Gen5 r = new Gen5();
//        ArrayList<Gen> list11= new ArrayList<Gen5>();
//        ArrayList <String> list1 = new ArrayList<String>();
//        List<String> list2= new ArrayList<String>();
//        Collection<Integer> list3= new ArrayList<Integer>();
//        List<Object> list4= new ArrayList<Object>();
       // List<int> list5= new ArrayList<int>(); -->no primitive data type is allowed

    }
}
