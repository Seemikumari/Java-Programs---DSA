class Demo{
    private int a;
    private int b;
//    public Demo(){  //this is a default constructor which is created by program if we don't specify any
//        
//    }
    public Demo(){
        this.a=a;
        this.b=b;
    }
    public Demo(int a , int b){
        this.a=a;
        this.b=b;
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Constructor {
    public static void main(String[] args) {
      Demo d=new Demo();  //object creation
      d.disp();
      Demo d2=new Demo(10,20);
      d2.disp();
    }
}
