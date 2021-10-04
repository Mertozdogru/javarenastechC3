package aaCalisma;

import java.util.Arrays;

public class odev4 {

    public static void calculation(int number1, int number2) {

        int result = number1 + number2;
        System.out.println("Number1+Number2 = " + result);
        int result1=number1*number2;
        System.out.println("Number1*Number2 = " + result1);

    }
    /*
write a program that can return the count of "java" and "javascript" anywhere in the sentence
String sentence = "I like java and javascript,java is best, java and javascript,java ";
*/
    public static void count() {
        String sentence = "I like java and javascript,java is best, java and javascript,java ";
        String sentence1 = sentence.toLowerCase();
        String[] split = sentence1.split(" ");
        System.out.println(Arrays.toString(split));
        int count1 = 0;
        int count2 = 0;
        String java = "java";
        String javascript = "javascript";

        for (String words : split) {
            if (words.contains(java)) {
                count1++;

            }
            if (words.contains(javascript)) {
                count2++;
            }
        }
        System.out.println("Numbers of java= " + count1);
        System.out.println("Numbers of java= " + count2);
    }
    /*
        Write a program that can print out the unique values from a String Array
        Ex:
                if arr -> {"A", "A", "B", "C", "C"}
        output: B

                    if arr -> {"A", "B", "B", "C"}
        output:  A
                C
     */
    public static void unique (String letter[]) {
        for (int i = 0; i < letter.length; i++) {
            int count = 0;
            //System.out.println(i);
            for (int j = 0; j < letter.length; j++) {
                if (letter[i] == letter[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(letter[i]);
            }
        }

}
//write a method that can identify if a string is palindrome
//            ex: palindrome("mom")  ==> true
    public static void palindrome(String st1){
        String[] splited=st1.split("");
        System.out.println(Arrays.toString(splited));
        String st2="";
        int index=splited.length-1;
        for (int i=index;i>=0;i--){
            st2+=splited[i];
        }
        System.out.println(st2);
        if (st1.equalsIgnoreCase(st2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }


    public static void main(String[] args) {
//// write a method that will take 3 parameters
//    // 2 numbers and one operator
//    // it will do the calculation
//
//    //ex : 200 100 +
//    //result 300
//
//    //ex 15 3 *
//    //result 45
        calculation(15, 20);
        count();
        String[] uniquee = {"A", "A", "B", "C", "C"};
        unique(uniquee);
        String st1 = "mom";
        palindrome(st1);












//                palindrome("hello") ==> false
    }
}
