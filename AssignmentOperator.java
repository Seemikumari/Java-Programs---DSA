public class AssignmentOperator {
    public static void main(String[] args) {
//        int a , b, c, d;
//        a = 10;
//        b = 10;
//        c = 10;
//        d = 10;
//        a = b= c =d =10;
//        System.out.println(a +" "+ b+  " "+ c +" "+d);

        int a = 10;
      //  a = a +10;
        a+=10;  //Compound assignment operator
        a *=10;
        System.out.println(a);

        int num3 = 10;
        num3 /= 5;
        System.out.println(num3);
    }
}
