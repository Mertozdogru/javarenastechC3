package aaCalisma.odev16;
/*
create a class called school:
                    create 3 objects of student and set their info
                    create a an ArrayList of students to store all student objects
                    use for each loop to print out each students' name and studentID
 */
public class school{
    public String name;
    public int age;
    public char gender;
    long studentID;
    public school(String name,int age,char gender,long studentID){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.studentID=studentID;
        System.out.println(name+" "+age+" "+gender+" "+studentID);

    }
}
