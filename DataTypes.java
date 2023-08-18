public class DataTypes {
    public static void main(String[] args) {
       // byte data = 45;
      //  int  data = 128;
//        byte num1 = 10;
//        byte num2 = 5;
//        int  data = num1+num2;
//        System.out.println(data);

        // TYPE CASTING
      int a = 45 ;
      double b = a;
        System.out.println(b);

        double c = 45.5;
        int d = (int)c; // this is called explicit-type casting
        System.out.println(d);//there is a chance of loss of precision in data

        int n1 = 12;
         int n2 = 5;
         float res=n1/n2;
        System.out.println(res);// value is truncating in int only
    }
}
