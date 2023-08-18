public class arrays {
    public static void main(String[] args) {
        //array is a collection of similar data types
        //use case:storing marks of 500 students
        //accessing/retrieval of  elements in array is faster as elements are stored in contiguous memory locations
        //arrays are mutable in nature
        // array indices starts from 0 and ends with (n-1) where n is size of array
        //there are three ways to create and array
     //int[] marks= new int[5]; //->declaration + memory allocation
        //int[] marks= {100,50,80,60,70}//->declare+memory allocation+initialization
        int []marks;  //->declaration
        marks = new int[5]; //->memory allocation
        marks[0]=100;
        marks[1]=50;
        marks[2]=80;
        marks[3]=60;
        marks[4]=70;
       // marks[5]=70; //will throw an exception
       // System.out.println(marks[3]);
      //  float[] marks1 ={95.5f,93.2f,94.1f,92.9f,86.9f};
      //  System.out.println(marks.length);
//        System.out.println(marks1[3]);
        String[] students={"seemi","raj","shivam","shibu","kittu"};
//
//        System.out.println(students.length);
//        //printing using naive method
//        System.out.println(students[0]);
//        System.out.println(students[1]);
//        System.out.println(students[2]);
//        System.out.println(students[3]);
//        System.out.println(students[4]);




            //using for loop for displaying our array
//        for(int i = 0;i<students.length;i++){
//            System.out.println(students[i]);
         //displaying array in reverse order
//        System.out.println("Printing the array in reverse order");
//            for(int i =marks.length-1;i>=0;i--){
//                System.out.println(students[i]);
              //displaying the array using for each loop
                System.out.println("Printing the array using for-each loop ");
                for(String  element:students){
                    System.out.println(element);
                }
                for(int element:marks){
                    System.out.println(element);
                }
            //Checking the class name for 1-D array it is for internal purpose , if we want to perform some operations then we need to use arrays class
             int [] ar= new int[4];
        System.out.println(ar.getClass());



    }
}
