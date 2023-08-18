enum Result{
    PASS,FAIL,NR;
    // the moment we are defining any constant this is what happening behind the scene
    // public static final Result PASS = new Result();
    // public static final Result FAIL = new Result();
    // public static final Result NR = new Result();
    int marks;

    Result(){
        System.out.println("Constructor in enum");
    }
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return marks;
    }
}
public class LaunchEnum1 {
    public static void main(String[] args) {
        Result.PASS.setMarks(50);
        int m=Result.PASS.getMarks();
        System.out.println(m);


//        int m1=Result.FAIL.getMarks();
//        System.out.println(m1);
    }
}
