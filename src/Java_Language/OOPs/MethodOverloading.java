package Java_Language.OOPs;
class Sum{
    int sum(int x, int y) {
        return (x + y);
    }
    int sum(int x, int y, int z) {
        return (x + y + z);
    }
    double sum(double x, double y) {
        return (x + y);
    }
}
class MethodOverloading{
    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println(obj.sum(10, 20));
        System.out.println(obj.sum(10.5, 20));
    }
}
