public class ErrorInJava {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 0;  //declare the variable outside the block because if we declare it inside the try block then it's scope will be limited within that class only
        int values[] = {5,7,9,2};
        String name = null;
        try {
            c = (a / b);   //giving a run-time error, it is a critical statement
            System.out.println(values[2]);
            System.out.println(name.length());
           // System.out.println("in try block");
        }
        catch(ArithmeticException e){
              //c=a/a;
            System.out.println("you can not divide a number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(c);
        System.out.println("bye");
    }
}
//in a program there are two types of statements one is normal statement and other one is critical statement
