package aaCalisma.odev16;

import java.util.ArrayList;
import java.util.Arrays;

public class object {
    public static void main(String[] args) {
        Person person1=new Person("HAZRETISABAN",27,'M');
        person1.eat();
        person1.sleep();
        person1.walk();
        System.out.println("person1 = " + person1);
        Student student1=new Student("Hikmet",30,'M',13512312L);
        student1.attendClass();
        System.out.println("student1 = " + student1);
        teacher teacher1=new teacher("Hafize",67,'F',"GARDIYAN");
        teacher1.startClass();
        System.out.println("teacher1 = " + teacher1);
        school student2=new school("dervis",14,'M',5123123L);
        school student3=new school("Hakki",63,'F',5123151L);
        school student4=new school("Bulut",62,'M',734573151L);
        ArrayList<school> studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(student2,student3,student4));
        for (school each:studentList){

        }
        System.out.println("student2.name+student2.studentID = " + student2.name +" " +student2.studentID);
        System.out.println("student3.name+ student3.studentID = " + student3.name +" " +student3.studentID);
        System.out.println("student4.name+student4.studentID = " + student4.name +" " +student4.studentID);
    }

}
