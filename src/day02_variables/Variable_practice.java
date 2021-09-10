package day02_variables;

public class Variable_practice {
    public static void main(String [] Args){
     byte b1=15;
     byte b2=126;
     byte b3=26;
     byte b4=59;
     byte b5=100;

     short s1=10000;
     short s2=5000;
     short s3=2500;
     short s4=150;
     short s5=5;

     int i1=2000000000;
     int i2=1000000000;
     int i3=5;
     int i4=100;
     int i5= 190;

     long l1=-90000000022222L;
     long l2=100L;
     long l3=199000002222L;
     long l4= 2857293L;
     long l5=1L;

     float f1=2.5f;
     float f2=3.4f;
     float f3=4.5f;
     float f4=5.1f;
     float f5= 6.7f;

     double d1=10.0;
     double d2=5.55555;
     double d3=6.1;
     double d4=7.14;
     double d5=1.0;

     boolean bool1=5<3;
     boolean bool2=d1<d2;
     boolean bool3=l5<l2;
     boolean bool4=i1>i3;
     boolean bool5=f2<f1;
     System.out.println(bool1);
     System.out.println(bool2);
     System.out.println(bool3);
     System.out.println(bool4);
     System.out.println(bool5);


     char c1='a';
     char c2='b';
     char c3='c';
     char c4='d';
     char c5='e';


     int number1=2;
     int number2=3;
     double number3=10.0;
     int number4=5;
     int number5=6;

     number5=number5+2; // now number5=8

     System.out.println(number1 + number2);
     System.out.println(number4 * number1);
     System.out.println(number3 / number5);
     System.out.println(number5 - number1);
     System.out.println(number3 % number4);
     System.out.println((number1+number2)-(number2+number3));
     System.out.println((number3*number1)/(number4+number5));
     System.out.println((number5%number2)*(number1-number4));
     System.out.println((number5/number2)%(number4+number3));

  System.out.println(number5); // I checked it if it changed
     int m1=350;
     int m2=2;
     int m3=3;
     int m4=5;

     boolean w1= m1%m2==0;
     boolean w2= m1%m3==0;
     boolean w3= m1%m4==0;

     System.out.println(w1);
     System.out.println(w2);
     System.out.println(w3);

     System.out.println(m1 + " is divisible by 2 " + w1);
     System.out.println(m1 + " is divisible by 3 " + w2);
     System.out.println(m1 + " is divisible by 5 " + w3);





























    }



}
