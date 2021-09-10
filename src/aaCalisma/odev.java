package aaCalisma;

import java.sql.SQLOutput;

public class odev {
    public static void main(String[] args) {
        //1.Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.
//2.please write a program that will return max number from 3 numbers

//16. Write a Java program to print a face. Go to the editor
//Expected Output
//
// +"""""+
//[| o o |]
// |  ^  |
// | '-' |
// +-----+

//32. Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39

//3.create a java program to check number is postive or negative


        //1.
        int i1 = 13;
        int i2 = 27;
        int i3 = 43;
        int i4 = 47;
        int i5 = ((i1 + i2 + i3 + i4) / 4);

        System.out.println("Average is = " + i5);
        //2.
        int m1 = 130;
        int m2 = 15;
        int m3 = -15;
        int max = m3;

        if (m2 > m3) {
            max = m2;
        }
        if (m1 > m2) {
            max = m1;
        }
        if (m3 > m1)
            max = m3;
        System.out.println("Maximum number is = " + max);
        //or
        boolean k1 = (m1 > m2) && (m1 > m3);
        boolean k2 = (m2 > m3) && (m2 > m1);
        boolean k3 = (m3 > m1) && (m3 > m2);
        if (k1) {
            System.out.println("m1=130 is max");
        }
        if (k2) {
            System.out.println("m2=15 is max");
        }
        if (k3) {
            System.out.println("m3=-15 is max");
        }

        //16.
        String a1 = " '''''''' ";
        String a2 = "[| o o |] ";
        String a3 = " |  ^  | ";
        String a4 = " | '-' | ";
        String a5 = " +-----+ ";
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        //32.

        int f1 = 25;
        int f2 = 39;
        boolean b1 = (f1 != f2);
        boolean b2 = (f1 < f2);
        boolean b3 = (f1 <= f2);

        if (b1) {
            System.out.println(f1 + "!=" + f2);
        }
        if (b2) {
            System.out.println(+f1 + "<" + f2);
        }
        if (b3) {
            System.out.println(+f1 + "<=" + f2);
        }

        //3.
        int int1 = -150;
        if (int1 < 0) {
            System.out.println("Number is negative");
        }
        if (int1 > 0) {
            System.out.println("Number is positive");
        }
        //or
        int int2 = -150;
        if (int2 > 0) {
            System.out.println("positive");
        } else if (int2 < 0) {
            System.out.println("negative");
        } else {
            System.out.println("nothing");
        }




    }
}
