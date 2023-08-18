//Time complexity : 0(n^2)
//Space complexity :O(1)
public
class DuplicatePWS {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4,4,5};
        int n = arr.length;
        // Time complexity =O(n^2)
        for(int i =0; i <n ; i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elements: "+ arr[i]);
                }
            }
        }
    }
}
