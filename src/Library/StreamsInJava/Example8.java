package Library.StreamsInJava;

import java.util.*;
import java.util.stream.Collectors;

class Example8 {
    static void main() {
        Student[] arr = { new Student(110,"abc",70),
                new Student(101,"bcd",70),
                new Student(102,"xyz",60) };
        Map<Integer, List<Student>> map = Arrays.stream(arr)
                                                .collect(Collectors.groupingBy(Student::getMarks));
        System.out.println(map);
    }
}
