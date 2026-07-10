package Library.Generics;

import java.util.ArrayList;

class Student{
    String name;
    int rollNo;
    int marks;
    int cgpa;
    Student(){

    }
    Student(String name, int roll){
        this.name = name;
        this.rollNo = roll;
    }
    void print(){
        System.out.println("Student");
    }
}
class EnggStudent extends Student{
    String branch;
    EnggStudent(){

    }
    EnggStudent(String name, int roll, String branch){
        super(name,roll);
        this.branch = branch;
    }
    void print(){
        System.out.println("EnggStudent");
    }
}
class WildCard {
    static void main() {
        Student s1 = new Student("a",1);
        EnggStudent s2 = new EnggStudent("b",2,"ee");
        s1 = s2;


        ArrayList<?> al1 = new ArrayList<>();
        ArrayList<EnggStudent> al2 = new ArrayList<>();
        al1 = al2;

    }
}
