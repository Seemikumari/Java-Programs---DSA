class Books{
    private String bookName;
   private  int pgNo;
   void setBookName(String bookName){  //in the setter instead of giving random variables x,y,z  write a value that you want to set
      this.bookName=bookName;  //name conflict between local and instance variable
   }
   String getBookName(){
       return bookName;
   }
   void setPgNo(int pgNo){

           this.pgNo=pgNo;
   }
   int getPgNo(){
       return pgNo;
   }
}

public class Encapsulate1 {
    public static void main(String[] args) {
        Books b = new Books();
       // b.pgNo=100;  //after making pgNo private we can't use it outside that class
        // System.out.println(b.pgNo);
         b.setPgNo(-100);
        System.out.println(b.getPgNo());
        b.setBookName("Java Book by Seemi");
    }
}
