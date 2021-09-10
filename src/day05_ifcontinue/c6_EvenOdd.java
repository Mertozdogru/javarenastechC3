package day05_ifcontinue;

public class c6_EvenOdd {
        public static void main(String[] args) {
            //create a java project that will check if number is even or odd

            int number ;

            number=25;
            String result = "";

            //lets try with if
            if (number % 2 == 0){
                result = number + " is even";
            }else {
                result = number + " is odd";
            }

            //shortcut of println is sout
            System.out.println(result);

            //ternary
            //if == ?
            //else == :

            String result2= (number % 2 == 0) ? number + " is even " : number + " is odd" ;

            System.out.println(result2);

            System.out.println("**************");

            //ben calisma yapiyorum
            int mert;
            mert=11;
            String sonuc= "";
            if ( mert % 2== 0){
              sonuc= mert+ "is even";
            }else {
                sonuc =mert+"is odd";
            }
            System.out.println(sonuc);


            String sonuc1  = (number%2==0) ? mert + "is even" : mert + " is odd";
            System.out.println(sonuc1);

    }
}
