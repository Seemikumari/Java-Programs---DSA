public class InvertedHalfPyramidRotated {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for (int i=1; i<=n;i++){
            //inner loop ->for spaces print
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop->for star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
