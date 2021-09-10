package aaCalisma;

public class reCap {
    public static void main(String[] args) {
        String[] kisiler = {"Mert", "Anil", "Umme"};
//        String[] kisiler = new String[3];
//        kisiler[0] = "Mert";
//        kisiler[1] = "Anil";
//        kisiler[2] = "Umme";

        for (int i = 0; i < kisiler.length; i++) {
            System.out.println(kisiler[i]);
        }
        System.out.println("******");

        for (String ogrenci : kisiler) {
            System.out.println(ogrenci);
        }
        System.out.println("******");

        double[] myList = {1.3, 1.4, 2.5, 5.2};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            System.out.println(number);
            total = total + number;
        }
        System.out.println("total is=" + total);
        System.out.println("max number is =" + max);
        System.out.println("******");

        int[] numaralar = {1, 2, 2, 3, 4};
        for (int sayim : numaralar) {
            System.out.println(sayim);
        }

        System.out.println("******");

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "izmir";
        sehirler[1][0] = "sinop";
        sehirler[1][1] = "samsun";
        sehirler[1][2] = "corum";
        sehirler[2][0] = "bolu";
        sehirler[2][1] = "kutahya";
        sehirler[2][2] = "karabuk";
        for (int i = 0; i <= 2; i++) {
            System.out.println("-----------");
            for (int j = 0; j <= 2; j++){
                System.out.println(sehirler[i][j]);
            }
        }


    }
}
