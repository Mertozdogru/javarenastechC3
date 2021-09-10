package aaCalisma;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        //1.
        Scanner mert = new Scanner(System.in);
        int n1;
        System.out.println("Number");
        n1 = mert.nextInt();
        if (n1 % 2 == 0) {
            System.out.println(n1 + " is even number");
        } else {
            System.out.println(n1 + " is odd number");
        }

        System.out.println("*************");

        //2.
        int n2;
        System.out.println("Number for absolute");
        n2= mert.nextInt();
        if(n2<0){
            System.out.println("Absolute value for "+ n2+ "="+ -(n2));
        }else if (n2>=0){
            System.out.println("Absolute value for "+ n2+ "="+ (n2));
        }else{
            System.out.println("Invalid becuse number is " + n2);
        }
        //3.
        System.out.println("Price");
        int price = 500;
        price=mert.nextInt();
        System.out.println("Quantity");
        int quantity = 2;
        quantity= mert.nextInt();
        int revenue = price * quantity;
        System.out.println("Revenue is = " + revenue);
        int discount = revenue * 10 / 100;
        if (revenue > 5000) {
            revenue = revenue - (revenue * 10 / 100);
            System.out.println(" Net revenue is = $" + revenue + " and Discount is = $" + discount);
        } else {
            System.out.println(" Net revenue is = $" + revenue + " and Discount is = $0");
        }








    }
}
