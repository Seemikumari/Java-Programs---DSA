public class HalfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for(int i=1;i<=n;i++){ //here i is the row number
            //inner loop
            for(int j = 1; j<=i;j++){ // here i defines the upper limit i.e total stars that we want to print
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
