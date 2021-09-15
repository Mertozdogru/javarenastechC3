package aaCalisma;

public class calisma {
    public static void main(String[] Args){
        System.out.println("this is Mert");
        System.out.print("Hello");
        System.out.println("2.CIZGI");

        boolean mert=false;
        boolean ozdogru=true;
        boolean hesap= 3<5;
        System.out.println(hesap);
        System.out.println(ozdogru);
        char ch='a';
        System.out.println(ch);
/*
consule output should be same order as given below
  First Name : name , ID : number
  Company Name :
  Salary :
*/
        System.out.print("First name:");
        System.out.println("Mert");
        System.out.print("ID Number:");
        System.out.println("57");

        System.out.print("First name : Hazal , ");
        System.out.println("ID : 28282828828282");
        System.out.println("Company Name : xxx");
        System.out.println("Salary : 800000");

        int sayi= 16; //calisma yapiyorum
        if(sayi<20) {
            System.out.println("Sayi 20den kucuktur");

        }
        if(sayi<15){
            System.out.println("Sayi 15ten kucuktur");
        }else{
            System.out.println("Sayi 15den kucuk degildir");

        }

        String[] ogrenciler = new String[5];
        ogrenciler[0]="Ahmet";
        ogrenciler[1]="Hasan";
        ogrenciler[2]="Mert";
        ogrenciler[3]="Mustik";
        ogrenciler[4]="kazim";

        for(String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }
        int lenght=100;
        int sum=0;
        for (int i=0;i<=lenght;i++){
            if (i%2!=0){
                System.out.println(i);
                sum+=i;
            }
        }                System.out.println("odd sum"+sum);











    }
}
