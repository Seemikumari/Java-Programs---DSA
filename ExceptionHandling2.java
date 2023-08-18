class MyException extends Exception{
    //Let's create a constructor here
    public MyException(){

    }
    public MyException(String msg){
       super(msg);
    }
}
public class ExceptionHandling2 {
    public static void main(String[] args) {
        int num1= 6;
        int num2 = -2;
        try{
            if(num2 < 0)//we have just one statement so we can remove the curly brackets
                //here we can throw the exception and pass the object of the exception
                //throw new ArithmeticException("negative number"); // here we are passing the number with help of constructor
                throw new MyException("Negative Number");
            else{
                int result = num1/ num2;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Enter a valid number"+ e);
        }
    }
}
