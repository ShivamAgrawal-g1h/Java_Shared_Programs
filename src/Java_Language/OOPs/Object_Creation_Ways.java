package Java_Language.OOPs;
class Student{
    int rno;
    double cgpa;
    String name,branch;
    Student(int a,double b, String c, String d){
        rno = a;
        cgpa = b;
        name = c;
        branch = d;
    }
}
class Object_Creation_Ways {
    public static void main(String[] args) throws Exception {
//        int[] arr;
//        int[] brr = new int[4];

        Student s1 = new Student(11,8.9,"Hari","Electrical");
        Student s2 = (Student) Class.forName("Java_Language.OOPs.Student")
                                    .getDeclaredConstructor()
                                    .newInstance();
        // OR The mordern recommended way :
        // Student s2 = Student.class.getDeclaredConstructor().newInstance();

        //Student s3 = (Student) s2.clone();

        //FileInputStream file = new FileInputStream(filename);
        //ObjectInputStream in = new ObjectInputStream(file);
        //Object obj = in.readObject();
    }
}
