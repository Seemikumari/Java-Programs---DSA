public class ConditionJava {
    public static void main(String[] args) {
        String name[]={"Seemi","Shivam","Raj"};
        int RollNo[]= {18,19,20};
        // IF CONDITION
//        if(name=="Seemi" && RollNo==18){
//            System.out.println("Details of Seemi");

    //    }
        //IF-ELSE CONDITION
//        if(name=="Seemi" && RollNo==15) {
//            System.out.println("Details of Seemi");
//        }else{
//            System.out.println("Invalid Details");
//        }
        if(name[0] =="Seemi" && RollNo[1]==18) {
            System.out.println("Details of Seemi");}
        else if(name[1] =="Shivam" && RollNo[2]==19)
        {
            System.out.println("Details of Shivam");
        }
        else if(name[2] =="Raj" && RollNo[2]==20)
        {
            System.out.println("Details of Raj");
        }else{
            System.out.println("Invalid Details");
            }





        }
}
