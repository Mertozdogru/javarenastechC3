package aaCalisma;

import java.util.Scanner;

public class scannercalisma2 {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        String esyaIsmi;
        int esyaSayisi;
        String esyaTuru;
        System.out.println("Esya ismi giriniz");
        esyaIsmi = mert.nextLine();
        System.out.println("Esya sayisi giriniz");
        esyaSayisi = mert.nextInt();
        mert.nextLine();
        System.out.println("Esya turu girinz");
        esyaTuru = mert.nextLine();
        System.out.println("Esya ismi = " + esyaIsmi);
        System.out.println("Esya sayisi = " + esyaSayisi);
        System.out.println("Esya turu = " + esyaTuru);


    }
}
