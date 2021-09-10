package aaCalisma;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.println("ilk sayiyi gir");
        sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi gir");
        sayi2 = scan.nextInt();

        System.out.println("1-toplama");
        System.out.println("2-Cikarma");
        System.out.println("3-Carpma");
        System.out.println("4-Bolme");
        System.out.println("Yapmak istediginiz islemi secin");
        secim = scan.nextInt();
        if (secim == 1) {
            System.out.println(sayi1 + sayi2);

        } else if (secim == 2) {
            System.out.println(sayi1 - sayi2);
        } else if (secim == 3) {
            System.out.println(sayi1 * sayi2);
        } else if (secim == 4) {
            if (sayi2 == 0) {
                System.out.println("Sayi 2 ye 0 degeri verdiginiz icin gecersizdir");
            } else {
                System.out.println(sayi1 / sayi2);
            }
        } else {
            System.out.println("Gecersiz sayi");
        }

    }
}
