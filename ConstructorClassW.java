
class ParentA{
    public ParentA(){
        System.out.println("Parent Constructor");
    }
}
class ChildS extends ParentA{
    public ChildS(){
        System.out.println("Child Constructor");
    }
}
class GrandChild extends ChildS{
    public GrandChild(){
        System.out.println("Grand Child Constructor");
    }
}
public class ConstructorClassW {
    public static void main(String[] args) {
        GrandChild c = new GrandChild();

    }
}
