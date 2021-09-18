package aaCalisma;

import java.util.Arrays;
import java.util.Scanner;

public class odevArray {
    public static void main(String[] args) {
        //Question 1
//
//Write Java statements that do the following:
//a) Declare an array numArray of 15 elements of type int.
//b) Output the value of the tenth element of the array alpha.
//c) Set the value of the fifth element of the array alpha to 35.
//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(numbers[9]);
        numbers[4] = 35;
        numbers[8] = numbers[5] + numbers[12];
        System.out.println(numbers[4]);
        System.out.println(numbers[8]);


//Question 2
//
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

//Question 3
//
//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.
   /*     int[] number=new int[10];
        int sum=0;
        System.out.println("Give me 10 numbers");
        Scanner mert=new Scanner(System.in);

        for (int i=0;i<10;i++){
            number[i]= mert.nextInt();
            sum+=number[i];
        }
        System.out.println("Sum of all array elements"+sum); */
//Question 4
//
//The variable list1 and list2 are reference arrays that each have 5 elements.
// Write code that copies the values in list1 to list2. Values in list1 are input by user.
        Scanner mert = new Scanner(System.in);

        int[] list1 = new int[5];
        int[] list2 = new int[5];
        System.out.println("put 5 elements");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = mert.nextInt();
        }
        for (int i = 0; i < list1.length; i++) {
            list2[i] = list1[i];
        }

        System.out.println("new list1" + Arrays.toString(list1));
        System.out.println("new list2" + Arrays.toString(list2));


//Question 5
//
//Write a Java program to reverse the element of an integer  array.
        System.out.println("Enter numbers of elements");
        int numb = mert.nextInt();
        int[] list3 = new int[numb];
        int reverse[] = new int[list3.length];

        System.out.println("enter the integers");
        for (int i = 0; i < list3.length; i++) {
            list3[i] = mert.nextInt();
        }
        for (int i = 0; i < list3.length; i++)
            reverse[i] = list3[list3.length - 1 - i];
        System.out.println(Arrays.toString(reverse));

//Question 6
//
//Write a Java program to find the largest and smallest element of an array.
        int[] k1 = {1, 4, 6, 2, -1};
        int max = k1[2];
        int min = k1[2];
        for (int i = 0; i < k1.length; i++) {
            if (k1[i] > max) {
                max = k1[i];
            }
        }
        for (int i = 0; i < k1.length; i++) {
            if (k1[i] < min) {
                min = k1[i];
            }
        }
        System.out.println("max number is " + max);
        System.out.println("min number is " + min);


//      // create a logic that will store 5 employees salaries (double) from scanner input
//    and print each salaries

//Output :
//
//Enter the salaries of 5 employees.
//234
//789
//123
//456
//453
//The salaries are:
//234.0
//789.0
//123.0
//456.0
//453.0
//task2

        double[] salary=new double[5];
        System.out.println("Enter the salaries of 5 employees.\n");
        for (int i=0;i< salary.length;i++){
            salary[i]= mert.nextDouble();
        }
        System.out.println("The salaries are:");
        for (int i=0;i<salary.length;i++){
            System.out.println(salary[i]);
        }
//write a program that can return the average number from an array of integers
//            ex:
//                [20, 25, 15]
//                average: 20

        int[] m1={10,2,5,26,2};
          int sum=0;
            for (int i=0;i<m1.length;i++){
                 sum+=m1[i];
        }
            int average=sum/m1.length;
        System.out.println("Average value of the array elements is : " + average);
//write a program that can return the sum of number from an array of integers
//            ex:
//                [20, 25, 15]
//                sum: 60
        int[] m2={10,2,5,26,2,5};
        int sum1=0;
        for (int i=0;i<m2.length;i++){
            sum1+=m2[i];
        }

        System.out.println("Sum of the array elements is : " + sum1);
//write a program that can return the min  number from an array of integers
//            ex:
//                [20, 25, 15]
//                min: 15
        //write a program that can return the max  number from an array of integers
//            ex:
//                [20, 25, 15]
        int[] k2 = {51, 14, 65, 22, -12};
        int max1 = k2[0];
        int min1 = k2[0];
        for (int i = 0; i < k2.length; i++) {
            if (k2[i] > max1) {
                max1 = k2[i];
            }
        }
        for (int i = 0; i < k2.length; i++) {
            if (k2[i] < min1) {
                min1 = k2[i];
            }
        }
        System.out.println("max number is " + max1);
        System.out.println("min number is " + min1);

//                max: 25
    }
}
