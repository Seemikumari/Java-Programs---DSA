public class ForEachloop {
    public static void main(String[] args) {
        int nums[][]={
                {3,5,7,8},
                {9,4,2,5,},
                {12,14,15,3}
        };
//        int nums[]={5,8,4,3};
//        for(int n :nums){
//            System.out.println(n);
//        }
        //iteration of 2-D array using for-each loop
        for(int a[]: nums){ //here a[] will iterate each array at once
            for(int b: a){ // here b will visit to each element of a[]
                System.out.print(b +" ");
            }
            System.out.println();
        }
//        for(int i=0; i<=2;i++){
//            for(int j=0;j<=3;j++){
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
