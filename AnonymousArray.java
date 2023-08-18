class calculator{
    public int add(int nums[]){
        int result =0;
        for(int n: nums){
            result = result+n;
        }
        return result;
    }
}
public class AnonymousArray {
    public static void main(String[] args) {
        calculator obj= new calculator();
        int result = obj.add(new int[]{5,4,3,2,8,7});
        System.out.println(result);

    }
}
