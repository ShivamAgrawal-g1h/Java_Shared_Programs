package Java_Language.OOPs;
abstract class Shape{
    int colour;
    String name;
    int getColour(){ return colour; }
    Shape(int c,String str){
        colour = c;
        name = str;
    }
    abstract double getArea();
}
class Square extends Shape{
    double side;
    Square(int c,String str, double s){
        super(c,str);
        side = s;
    }
    double getArea(){ return side*side; }
}
class AbstractClass {
    public static void main(String[] args) {
        Square s = new Square(5,"Square",10.0);
        System.out.println(s.getArea());
    }
}
