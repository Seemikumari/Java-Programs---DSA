interface computer{    //now you can't create object of it
    public abstract void  compileCode();
}
class Laptop implements computer{
    public void compileCode(){

        System.out.println("you got 5 errors");
    }
}
class Desktop implements computer{
    public void compileCode(){

        System.out.println("yoe got 5 errors faster");
    }
}
class Developer{
   // Laptop obj = new Laptop();
    public void buildApp(computer obj){
        System.out.println("I'm AppDeveloper");

        obj.compileCode();

    }
}
public class InTerface2 {
    public static void main(String[] args) {
       // computer obj = new computer();
       // Laptop obj = new Laptop();
        computer obj = new Laptop();
        Developer dev = new Developer ();
        dev.buildApp(obj);


    }
}
