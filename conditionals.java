public class conditionals {
    public static void main(String[] args) {
        //whenever we want our program to take decisions
        /* decision-making instruction in java are:
        1.If else statement
        2.switch statement
         */
//        int age = 6;
//        if(age>=18){
//            System  .out.println("yes you can drive");
//        }else{
//            System.out.println("no you can't buddy");
//        }
//    }
//        int age = 77;
//        if (age >= 18 && age <70) {
//            System.out.println("yes you can drive");
//        } else if (age >= 70) {
//            System.out.println("old age");
//        } else {
//            System.out.println("no you can't buddy");
//        }
        int age=32;
        if(age >= 18 && age<=60){
            if(age>=20 && age<=30){
                System.out.println("you are in 20s");

            }
            else if(age>30 && age<=60){
                System.out.println("you are in 30s");
            }
            else{
                System.out.println("tou are still teen");
            }
        }else if(age>60){
            System.out.println("you are 60 plus old year man");
        }
        else{
            System.out.println("you are a kid");
        }
    }
}
