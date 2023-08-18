import java.util.Scanner;
public class ArrayA {
    public static void main(String[] args) {
        double []myList=new double[4];
        myList [0]=1.9;
        myList [1]=2.9;
        myList [2]=3.4;
        myList [3]=4.5;

    double max=myList[0];
    int indexOfMax=0;
    for(int i =1; i<myList.length;i++){
        if(myList[i]>max){
            max=myList[i];
            indexOfMax=i;
            System.out.println(max);
        }
    }
    }
}
