package aaCalisma;

public class Ternary {
    public static void main(String[] args) {
        int num1=10;
        int num2=-5;
        int min=0;
        if (num1<num2){
            min=num1;
        }else{
            min=num2;
        }
        System.out.println("min number is = "+ min);
    //TERNARY
        //if= ?
        //else :
    int number3=20;
    int number4=-99;
    int maxnumber=(number3>number4)?number3:number4;
        System.out.println("max number is = " + number3);

String st1="JAVA";
String st2="java";
String result=(st1.equalsIgnoreCase(st2))?"True":"False";
        System.out.println("result = " + result);


    }
}

