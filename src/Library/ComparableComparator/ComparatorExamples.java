package Library.ComparableComparator;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorExamples {
    static void main() {
        String[] arr = { "gfg", null, "ide", null};
        Arrays.sort(arr,
                Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"gfg","course","ide"};
        Arrays.sort(arr2,
                Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));

        Student[] arr3 = { new Student("abc",120),
                            new Student("xyz",110),
                            new Student("abc",101)};
        Arrays.sort(arr3,
                Comparator.comparing(Student::getName)
                        .thenComparing(Student::getRoll));
        System.out.println(Arrays.toString(arr3));
        // NOTE : toString() method must be overridden in Student class for it to
        // print the desired output instead of reference
    }
}
