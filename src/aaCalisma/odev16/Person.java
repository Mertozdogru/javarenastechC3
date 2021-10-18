package aaCalisma.odev16;

/*task2
create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo */
public class Person {
    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + " eats cereal");
    }

    public void walk() {
        System.out.println(name + gender + " and " + " walks everday ");
    }

    public void sleep() {
        System.out.println(name + gender + age + " sleep 10 hours ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
