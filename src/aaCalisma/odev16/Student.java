package aaCalisma.odev16;
//create a class called Student
//        attributes: name, age, gender, studentID
//        methods: attendClass, setStudentInfo, toString
public class Student {
   public  String name;
    public int age;
    public char gender;
    public long studentID;
    public Student(String name,int age,char gender,long studentID){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.studentID=studentID;
    }
    public void attendClass(){
        System.out.println(name+" with id number "+ studentID+" not attending the class ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studentID=" + studentID +
                '}';
    }
}
