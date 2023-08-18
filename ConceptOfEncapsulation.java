class Student{
    private String name;
    private int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class ConceptOfEncapsulation {
    public static void main(String[] args) {
        Student st = new Student("seemi", 18);//constructor call
//        st.setName("Seemi");
//        st.setAge(18);

        String name=st.getName();
        System.out.println(name);
        int age=st.getAge();
        System.out.println(age);

    }
}
