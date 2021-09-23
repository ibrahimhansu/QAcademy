package week3;


/* Couldn't complete it as functioning, left it classes.
 */

 class Person {
    String name;
    String surname;
    int age;
    String gender;

    Person(String name, int age, String gender){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
    }

}

public class Teacher extends Person {

     arr courses[];

    Teacher(String name, String surname, int age, String gender) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
public class Student extends Person {
        int year;

        Student(String name, String surname, int age, String gender,int year){
            super();
            this.name=name;
            this.surname=surname;
            this.age=age;
            this.gender=gender;
            this.year=year;
        }


    public class Course {
        String name;
        int credit;
        int studentCount;


        Course(String name, int credit, int numberofStudent){
            this.name=name;
            this.credit=credit;
            this.studentCount=numberofStudent;

        }


        }
}