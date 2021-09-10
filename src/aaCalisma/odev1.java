package aaCalisma;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        int number;
        number = 25;
        String num1 = ((number % 2 == 0) && (number % 5 == 0)) ? number + " is divisible " : number + " is not divisible ";
        System.out.println(num1);
        //or
        System.out.println("************");

        int n1 = 40;
        String result = "";
        if (n1 % 2 == 0 && n1 % 5 == 0) {
            result = n1 +" is divisible";
        } else {
            result = n1+" is not divisible";
        }
        System.out.println(result);


        System.out.println("************");

        int a1 = 50;
        int a2 = 150;
        int a3 = 20;
        int max;
        if ((a1 > a2) && (a1 > a3)) {
            max = a1;
        } else if ((a2 > a1) && (a2 > a3)) {
            max = a2;
        } else {
            max = a3;
        }
        System.out.println(max);

        System.out.println("************");

        double d1 = -10.5;
        String result2 = "";
        if (d1 > 0) {
            result2 = d1+ " is Positive";
        } else if ((d1 < 0)) {
            result2 = d1+ " is Negative";
        } else {
            result2 = d1 + " is neither positive nor negative";
        }
        System.out.println(result2);

        System.out.println("************");
        int price = 500;
        int quantity = 2;
        int revenue = price * quantity;
        int discount = revenue * 10 / 100;
        if (revenue > 5000) {
            revenue = revenue - (revenue * 10 / 100);
            System.out.println(" Net revenue is = $" + revenue + " and Discount is = $" + discount);
        } else {
            System.out.println(" Net revenue is = $" + revenue + " and Discount is = $0");
        }

        System.out.println("************");

        int m1 = 15;
        int m2 = 18;
        int m3 = 100;
        String result3 = "";
        if (m1 + m2 + m3 == 180) {
            result3 = "Triangle is valid";
        } else {
            result3 = "Triangle is not valid";
        }
        System.out.println(result3);


    }
}
