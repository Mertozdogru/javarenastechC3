package aaCalisma;

import java.util.Locale;

public class odev2 {
    public static void main(String[] args) {
        //Task 1 : String Methods
//Sentence =hello my name is hello worlD.     i am 25 years old. i am living in new yorK .       i have been in the IT industry for about 6 years.    i starteD as a manUal tesTer and now doing AutOMation for about 4 years.   i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.my main lanGuage is JAVA. i designed and deveLoped many automation test scripts by using BDD framework


//first create one string and copy pass above paragraf.
//then create multiple strings to store each sentence that you see in the paragraf.
//Do below modification for your sentences :
//make sure each sentence first letter capital .
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences
//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.

        String paragraph = "hello my name is hello worlD.  i am 25 years old. " +
                "i am living in new yorK .       i have been in the IT industry for about 6 years.    " +
                "i starteD as a manUal tesTer and now doing AutOMation for about 4 years.   " +
                "i have experience in different DOmains: education, Energy, finance." +
                "i have Scrum Master and Oracle Java Programmer certificates.my main lanGuage is JAVA." +
                " i designed and deveLoped" +
                " many automation test scripts by using BDD framework";
        String mert = "           hello my name is hello worlD.  ";
        String mertx = "  i am 25 years old. ";
        String mert1 = "  i am living in new yorK .       i have been in the IT industry for about 6 years.    ";
        String mert2 = " i starteD as a manUal tesTer and now doing AutOMation for about 4 years.   ";
        String mert3 = " i have experience in different DOmains: education, Energy, finance.  ";
        String mert4 = " i have Scrum Master and Oracle Java Programmer certificates.my main lanGuage is JAVA.  ";
        String mert5 = "i designed and deveLoped";
        String mert6 = " many automation test scripts by using BDD framework ";
        String trim = mert.trim().replaceAll(" +", " ");
//        int b=trim.length(); 29 letter
//        System.out.println(b);
        String lowAndUpper = trim.substring(0, 1).toUpperCase().concat(trim.substring(1, 29).toLowerCase());
        //  System.out.println(lowAndUpper);
        String replace = lowAndUpper.replace("hello world", "Mert");
        System.out.println(replace);
        System.out.println(replace.length());
        int lastIndex = replace.lastIndexOf(".");
        System.out.println(lastIndex);
        char a = replace.charAt(1);
        char b = replace.charAt(5);
        char c = replace.charAt(21);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
