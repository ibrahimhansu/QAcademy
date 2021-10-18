package week3;


public class Person {
   public String name;
   public String surname;
   public int age;
   public String gender;

   public Person(String name, String surname, int age, String gender){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class Teacher extends Person {

  Teacher(String name, String surname, int age, String gender){
      super();
      this.name=name;
    this.surname=surname;
    this.age=age;
    this.gender=gender;

}
        int courseCount=0;
 ArrayList<Course> givenCourses = new ArrayList<>();

 public  void giveCourse(Course course){
     if (courseCount<3) {
         this.givenCourses.add(course);
         courseCount++;
     }
     else
         System.out.println("A teacher can give maximum 3 courses.");

 }

}

public class Student extends Person {
  private int year;

    Student(String name, String surname, int age, String gender,int year){
        super();
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
        this.year=year;
    }

    int creditCount=0;
    ArrayList<Course> takenCourses=new ArrayList<>();

    public void takingCredits(Course course){
        creditCount=creditCount + course.getCredit();
        if (countofCredit<20){
            this.takenCourses.add(course);
            System.out.println("count of credit is: " + creditCount);
            course.studentCounter();
        }
        else
            System.out.println("A student can take maximum 20 credits");

    }

     public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


    public class Course {
    private String courseName;
    private int credit;
    public int studentCount = 0;


    Course(String name, int credit) {
        this.courseName = courseName;
        this.credit = credit;

        ArrayList<Student> studentList = new ArrayList<>();


    }


    public String getcourseName() {
        return nameOfCourse;
    }

    public int getCredit() {
        return credit;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setcourseName(String name) {
        this.nameOfCourse = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    public void studentCounter (){
        if (studentCount<20){
            studentCount++;
        }
        else
            System.out.println("A course is can taken by maximum 20 students.");
    }


}


public class Main {

    public static void main (String[] args){
        Course phil = new Course ("phil101",6);
        Teacher ibr = new Teacher("ibr","hansu",23,"male");
        Course mat= new Course("mat101",3);
        Course esc= new Course("esc101",5);
        Course soc= new Course("soc101",3);
        Student zeynep= new Student("zeynep", "gumus",24,"female",4);
        Student firat= new Student("fırat","fire",25,"male",3);


        System.out.println("Fırat's courses..." );
        firat.takingCredits(soc);
        firat.takingCredits(phil);
        firat.takingCredits(esc);
        System.out.println("Fırat's courses" + firat.takenCourses);

        System.out.println("Can's courses..." );
        zeynep.takingCredits(mat);
        zeynep.takingCredits(esc);
        zeynep.takingCredits(soc);
        System.out.println("Can will take following courses" + can.takenCourses);


        System.out.println("Teacher's courses..." );
        ibr.giveCourse(soc);
        ibr.giveCourse(mat);
        ibr.giveCourse(esc);
        ibr.giveCourse(phil);
        System.out.println("ibr courses" + ibr.givenCourses);
    }



}
