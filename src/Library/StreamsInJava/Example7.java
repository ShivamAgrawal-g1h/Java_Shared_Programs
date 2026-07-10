package Library.StreamsInJava;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Example7 {
    static void main() {
        Student[] arr = { new Student(110,"abc",70),
                new Student(101,"bcd",80),
                new Student(102,"xyz",60) };
        Map<Integer,String> map = Arrays.stream(arr)
                                        .collect(Collectors.toMap(Student::getRoll,
                                                                  Student::getName));
        System.out.println(map);
    }
}
