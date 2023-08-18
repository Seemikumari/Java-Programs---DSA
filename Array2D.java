public class Array2D {
    public static void main(String[] args) {
//        int nums[][] = new int[3][2];
//        nums[0][0]=3;
//        nums[0][1]=5;
//        nums[1][0]=9;
//        nums[1][1]=4;
//        nums[2][0]=12;
//        nums[2][1]=14;
        //Jagged Array
//        int nums1[][] = new int[3][];
//        nums1[0]=new int [3];//for each row we have to specify the number of columns we want in that row
//        nums1[1]= new int [5];
 // forming jagged rows by values
        int nums[][]={
                {3,5,7,8},
                {9,4,2},
                {12,14}
        };
        //iteration of jagged array
        for(int i =0;i<=2;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }

        //iteration of normal array
        for(int i =0;i<=2;i++){
            for(int j=0;j<=1;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
