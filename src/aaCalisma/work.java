package aaCalisma;

import java.sql.SQLOutput;

// x y z
// min number
// create a logic that will going to print minumum number between 3 numbers
public class work {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        boolean bool1 = i1 < i2 && i1 < i3;
        boolean bool2 = i2 < i3 && i2 < i1;
        boolean bool3 = i3 < i1 && i3 < i2;
        if (bool1) {
            System.out.println("i1 is minimum");
        }
        if (bool2) {
            System.out.println("i2 is minimum");
        }
        if (bool3) {
            System.out.println("i3 is minimum");
        }

        int m1=10;
        int m2=20;
        int m3=30;

        int min= m3;

        if (m2<m3) {
            min=m2;

        }
        if (m1<m3){
            min=m1;
        }
        if (m1<m2){
            min=m1;
        }
        if (m2<m1){
            min=m2;
        }
        System.out.println("min =" +min);


        int k1=35;
        int k2=25;
        int k3=45;
        int minimum =k2;

        if(k1<k2){
            minimum=k1;
        }
        if (k3<k1){
            minimum=k3;
        }
        if (k2<k3){
            minimum=k2;
        }
        System.out.println("minumum is ="+ minimum);


    }
}
