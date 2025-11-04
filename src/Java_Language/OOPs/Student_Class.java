package Java_Language.OOPs;

public class Student_Class {
    public static class Student{
        String name;
        int rno;
        String branch;
        double cgpa;
    }
    public static class Skills extends Student{
        String skills;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Hitesh";
        s1.cgpa = 9;
        s1.rno = 68;

        Student s2 = new Student();
        s2.name = "Naitik";
        s2.branch = "Electrical";
        s2.rno = 11;

        Skills s3 = new Skills();
        s3.name = "Shubh";
        s3.branch = "AI & DS";
        s3.skills = "DSA in python";

        Student s4 = new Student();
        System.out.println(s4.name);
        System.out.println(s4.branch);
        System.out.println(s4.rno);
        System.out.println(s4.cgpa);
    }
}
