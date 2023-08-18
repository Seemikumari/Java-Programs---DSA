public class Final {
    public static void main(String[] args) {
//       final  int a=10;
//        a=20;
//        System.out.println(a);
//       final  StringBuffer str=new StringBuffer("virat");
//        str.append("kohli");
//        System.out.println(str);
//        str=new StringBuffer("Seemi");
//        System.out.println(str);

//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.capacity());
//        sb.append("abcdefghijklmnop");//until 16 characters it will remain 16 only
//        System.out.println(sb.capacity());
//        sb.append("s");
//        System.out.println(sb.capacity());//how many characters you can add
//        System.out.println(sb.length());//how many characters are already present
//
//        StringBuffer sb2=new StringBuffer("Seemi");//number of characters you added + 16
//        System.out.println(sb2);
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.charAt(1));
//        sb2.setCharAt(1,'A');
//        System.out.println(sb2);

//        StringBuilder sb=new StringBuilder(150);
//        System.out.println(sb.capacity());
//        sb.append("java");
//        System.out.println(sb);
//        sb.trimToSize(); //delete the unused spaces that we have requested for
//        System.out.println(sb.capacity());

        StringBuilder sb= new StringBuilder();
        sb.append("seemi");
        System.out.println(sb.reverse());

    }
}
