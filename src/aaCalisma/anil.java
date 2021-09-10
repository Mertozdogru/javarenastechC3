package aaCalisma;

import java.util.Scanner;

public class anil  {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayi: ");
        int number1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("2.sayi: ");
        int number2 = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("3.sayi: ");
        int number3 = scan3.nextInt();


        if((number1+number2+number3)==180){
            System.out.println("it is a triangle");
        }else {
            System.out.println("not triangle");
        }
    }
}