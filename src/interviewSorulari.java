import java.lang.reflect.Array;
import java.util.Arrays;

public class interviewSorulari {
    public static void main(String[] args) {
        //(String) Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA
        String text="ABCD";
        int indexnumber=text.length()-1;
        String reverse ="";
        for (int i=indexnumber;i>=0;i--){
            reverse+=text.charAt(i);
        }
        System.out.println(reverse);

//(String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:







//(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC

//(String) Find the unique
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

//(Array) Find Maximum
//Write a method that can find the maximum number from an int Array
        int[] array1={1,52,6346,235,512312};
        Arrays.sort(array1);
        int index=array1.length-1;
        int Maximum=array1[index];
        System.out.println("Maximum number is = "+ Maximum);

//(Array) Find Minimum
//Write a method that can find the maximum number from an int Array
        int[] array={1,52,6346,235,-1};
        Arrays.sort(array);
        int Minimum=array[0];
        System.out.println("Minimum number is = "+ Minimum);

//(Array) Concat two arrays
//Write a return method that can concate two arrays

    }

}
