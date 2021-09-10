package aaCalisma;

import java.util.Scanner;

public class calismaScanner {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        String isim, soyisim;
        int yas;
        String boy;
        double kilo;
        System.out.println("Isim ve soyisim giriniz");
        isim = mert.nextLine();
        soyisim = mert.nextLine();
        System.out.println("Yasinizi giriniz");
        yas = mert.nextInt();
        System.out.println("Kilonuzu giriniz");
        kilo = mert.nextDouble();
        mert.nextLine();
        System.out.println("Boyunuzu giriniz");
        boy = mert.nextLine();
        System.out.println("Isim =" + isim + "\n"+ "Soyisim =" + soyisim);
        System.out.println("Yasiniz " + yas);
        System.out.println("Kilonuz" + kilo);
        System.out.println("boyunuz" + boy);


    }
}
