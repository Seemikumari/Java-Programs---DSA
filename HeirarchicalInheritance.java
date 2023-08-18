//In heirarachical inheritance :in this one -parent class have multiple childs
class Animals{
    void disp(){
        System.out.println("I 'm an Animal");
    }
}
class Cat extends Animals{

}
class Monkey extends Animals{

}
class Deer extends Animals{

}
public class HeirarchicalInheritance {
    public static void main(String[] args) {
       Cat c = new Cat();
       c.disp();
    }
}
