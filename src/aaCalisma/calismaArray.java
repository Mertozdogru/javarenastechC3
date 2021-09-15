package aaCalisma;


import java.util.Arrays;

public class calismaArray {
    public static void main(String[] args) {
        int[] numbers=new int[4];
        numbers[1]=10;
        numbers[2]=20;
        numbers[3]=30;
        System.out.println(Arrays.toString(numbers));

        //combine 2 different array
        //list1 == 1 ,2 3,4
        //list2 == 5,6,7,8,9

        int[] list1={1,2,3,4};
        int[] list2={5,6,7,8,9};
        int[] newlist=new int[list1.length+list2.length];
        for (int i=0;i<list1.length;i++){
            newlist[i]=list1[i];
        }
        for (int i=0;i<list2.length;i++){
            newlist[list1.length+i]=list2[i];
        }
        System.out.println(Arrays.toString(newlist));
    }
}





