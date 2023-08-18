public class ComparingStrings {
    public static void main(String[] args) {
//        String s1="Seemi";
//        String s2=new String("Seemi");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

//        String s1="seemi";
//        String s2="seemi";
//        String s3="SEEMI";

        String s1 ="seemi";
        String s2 = new String("Seemi");
        String s3 = new String("seemi");

        System.out.println(s1==s2); //references will be compared
        System.out.println(s1==s3);

        System.out.println(s1.equals(s2)); //values will be compared
        System.out.println(s2.equalsIgnoreCase(s3)); //this method will compare the values by ignoring the cases(upper case or lower case)



    }
}
