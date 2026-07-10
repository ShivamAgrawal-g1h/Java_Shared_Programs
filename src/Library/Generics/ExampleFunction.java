package Library.Generics;

import java.util.ArrayList;

class MgmtStudent extends Student{
    void print(){
        System.out.println("MgmtStudent");
    }
}
class ExampleFunction {
    static void printStudents(ArrayList<? extends Student> al){
        for(Student s : al){
            s.print();
        }
    }

    static void main() {
        ArrayList<EnggStudent> al1 = new ArrayList<>();
        al1.add(new EnggStudent());
        al1.add(new EnggStudent());
        ArrayList<MgmtStudent> al2 = new ArrayList<>();
        al2.add(new MgmtStudent());
        ArrayList<Student> al3 = new ArrayList<>();
        al3.add(new Student());
        al3.add(new MgmtStudent());
        al3.add(new EnggStudent());
        printStudents(al1);
        printStudents(al2);
        printStudents(al3);

    }
}
