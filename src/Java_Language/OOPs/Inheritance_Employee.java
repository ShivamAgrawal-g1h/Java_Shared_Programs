package Java_Language.OOPs;
class Employee {
    int id;
    int salary;
    Employee(int i, int s){
        id = i;
        salary = s;
    }
}
class SalesEmp extends Employee{
    int salesInc; // sales incentive
    SalesEmp(int i, int s, int si){
        super(i,s);
        salesInc = si;
    }
}
class Inheritance_Employee{
    public static void main(String[] args) {
        SalesEmp s1 = new SalesEmp(101,30000,10000);
        System.out.println("Salary : "+s1.salary);
        System.out.println("ID : "+s1.id);
        System.out.println("SalesInc. :"+s1.salesInc);
    }
}