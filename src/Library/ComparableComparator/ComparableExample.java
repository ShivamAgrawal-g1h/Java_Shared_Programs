package Library.ComparableComparator;

class Student implements Comparable<Student>{
    String name;
    int rollNo;
    Student(String name, int id){
        this.name = name;
        this.rollNo = id;
    }
    public int compareTo(Student s2){
        return this.rollNo-s2.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public int getRoll(){
        return this.rollNo;
    }
    @Override
    public String toString(){
        return "("+name+","+rollNo+")";
    }
}
