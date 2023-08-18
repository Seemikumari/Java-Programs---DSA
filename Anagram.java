import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        //using the characters of one string for framing the new string by interchanging the position of characters of first string is called anagram.
    //example : School Master: The Classroom
        //steps involved in solution:
        //check for space if space is there in between then remove it.
        //example:SchoolMaster,TheClassroom
        //convert the characters in either upper or lower case
        //example:schoolmaster,theclassroom
        //convert the string to array
        //sorting
        //check whether sorted order is same or not

        String str1="School Master";
        String str2="The Classroom";
        //remove the spaces
        str1=str1.replace(" ","");
       str2= str2.replace(" ","");
       //covert it into lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        //convert the string to character array
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("It is an anagram");
        }else{
            System.out.println("It is not an anagram");
        }


    }

}
