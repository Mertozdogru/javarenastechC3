package aaCalisma.odev16;

import java.util.Locale;

/*create a class called Teacher
        attributes: name, age, gender, teacherType
        methods: startClass, setTeacherInfo, toString */
public class teacher {
    public String name;
    public int age;
    public char gender;
    public String teacherType;
    public teacher(String name,int age,char gender,String teacherType){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.teacherType=teacherType;
    }
    public void startClass(){
        System.out.println(name+ "starts class with "+ teacherType);
    }

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", teacherType='" + teacherType + '\'' +
                '}';
    }
}
