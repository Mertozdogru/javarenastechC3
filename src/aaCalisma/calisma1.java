package aaCalisma;

public class calisma1 {
    public static void main(String[] args) {
        String[] ogrenciler = new String[5];
        ogrenciler[0]="Ahmet";
        ogrenciler[1]="Hasan";
        ogrenciler[2]="Mert";
        ogrenciler[3]="Mustik";
        ogrenciler[4]="kazim";
        for(int i=0; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("***************");

        for(String ogrenci : ogrenciler ){
            System.out.println(ogrenci);
        }
        System.out.println("***************");

        for(int i=0; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("***************");

        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }

        int i1=5;
        int i2=79;
        int i3=35;
        int maxNumber=i1;

        if(i3>i1){
            maxNumber=i3;
        }
        if (i2>i3){
            maxNumber=i2;
        }
        if (i1>i2){
            maxNumber=i1;
        }


        System.out.println("Max Number is =" + maxNumber);


        String mert="mert";
        String mert2="anil";
        System.out.println(mert.concat(" "+ mert2));



    }
}
