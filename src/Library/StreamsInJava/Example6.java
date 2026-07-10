package Library.StreamsInJava;

import java.util.Arrays;

class Student{
    int roll;
    int marks;
    String name;
    Student(int r, String n, int m){
        roll = r;
        name = n;
        marks = m;
    }
    int getRoll(){ return roll; }
    String getName(){ return name; }
    int getMarks(){ return marks; }
}
class Example6 {
    static void main() {
        Student[] arr = { new Student(110,"abc",70),
                            new Student(101,"bcd",80),
                            new Student(102,"xyz",60) };
        double res = Arrays.stream(arr)
                .mapToInt(x -> x.getMarks())
                .average()
                .getAsDouble();
        System.out.println(res);
    }
}
