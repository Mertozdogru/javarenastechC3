package aaCalisma;

////1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
////Expected Output :
////Hello
////Alexandra Abramov
////2. Write a Java program to print the sum of two numbers.
////Test Data:
////74 + 36
////Expected Output :
////110
////
////3. Write a Java program to divide two numbers and print on the screen.
////Test Data :
////50/3
////Expected Output :
////16
////
////4. Write a Java program to print the result of the following operations.
////Test Data:
////a. -5 + 8 * 6
////b. (55+9) % 9
////c. 20 + -3*5 / 8
////d. 5 + 15 / 3 * 2 - 8 % 3
////Expected Output :
////43
////1
////19
////13
////
////5. Write a Java program that takes two numbers as input and display the product of two numbers.
////Test Data:
////Input first number: 25
////Input second number: 5
////Expected Output :
////25 x 5 = 125
////
////6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
////Test Data:
////Input first number: 125
////Input second number: 24
////Expected Output :
////125 + 24 = 149
////125 - 24 = 101
////125 x 24 = 3000
////125 / 24 = 5
////
////7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
////Test Data:
////Input a number: 8
////Expected Output :
////8 x 1 = 8
////8 x 2 = 16
////8 x 3 = 24
////...
////8 x 10 = 80
////
////8. Write a Java program to display the following pattern.
////Sample Pattern :
////
////   J    a   v     v  a
////   J   a a   v   v  a a
////J  J  aaaaa   V V  aaaaa
//// JJ  a     a   V  a     a
////
////9. Write a Java program to compute the specified expressions and print the output.
////Test Data:
////((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
////Expected Output
////2.138888888888889
////
////10. Write a Java program to compute a specified formula.
////Specified Formula :
////4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
////Expected Output
////2.9760461760461765
////12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class homeWork {
    public static void main(String[] args) {
        //1.
        String st1 = "Hello";
        String st2 = "Mert";

        System.out.println(st1);
        System.out.println(st2);
        //2.
        int i1 = 74;
        int i2 = 36;
        System.out.println(i1 + i2);
        //3.
        int i3 = 50;
        int i4 = 3;
        System.out.println(i3 / i4);
        //4.
        int i5 = 5;
        int i6 = 8;
        int i7 = 6;
        int i8 = 55;
        int i9 = 9;
        int i10 = 20;
        int i11 = 3;
        int i12 = 15;
        int i13 = 2;

        System.out.println(-i5 + i6 * i7);
        System.out.println((i8 + i9) % i9);
        System.out.println(i10 - i11 * i5 / i6);
        System.out.println(i5 + i12 / i11 * i13 - i6 % i11);
        //5.
        int i14 = 25;
        int i15 = 5;
        String s1 = "25";
        String s2 = "5";
        System.out.println(s1 + "*" + s2 + "=" + i14 * i15);
        System.out.println(i14 + "*" + i15 + "=" + i14 * i15);

        //6.
        int i16 = 125;
        int i17 = 24;
        System.out.println(i16 + "+" + i17 + "=" + (i16 + i17));
        System.out.println(i16 + "-" + i17 + "=" + (i16 - i17));
        System.out.println(i16 + "*" + i17 + "=" + (i16 * i17));
        System.out.println(i16 + "/" + i17 + "=" + (i16 / i17));
        //7.
        int i18 = 8;
        int i19 = 0;
        System.out.println(i18 + "*" + +i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));
        System.out.println(i18 + "*" + ++i19 + "=" + (i18 * i19));

        //8.
        String j1 = "   J    a   v     v  a";
        String j2 = "   J    a   v     v  aa";
        String j3 = " JJ   aaaaa   V  V  aaaaa";
        String j4 = " JJ  a     a   V  a      a";
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        System.out.println(j4);

        //9.
        double d1 = 1.5;
        double d2 = 3.5;
        double d3 = 5.5;
        double d4 = 7.5;
        System.out.println((d1 * d3 - d4 * d2) / (d4 - d3));
        //10.
        int m1 = 10;
        int m2 = 15;
        int m3 = 20;
        double e1 = 1.5;
        double e2 = 4.5;
        double e3 = 5.5;
        double e4 = 6.5;
        System.out.println(m2 * ((e2 / e1) - (m2 / e3) + (e4 / m1) - (m3 + e1)));
        //11.
        int i20 = 15;
        int i21 = 30;
        int i22 = 45;
        String s11 = "Average of ";
        System.out.println(s11 + i20 + "," + i21 + "," + i22 + "= " + (i20 + i21 + i22) / 3);


    }
}
