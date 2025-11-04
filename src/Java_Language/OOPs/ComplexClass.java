package Java_Language.OOPs;

public class ComplexClass {
    private static class Complex{
        int real, imag;
        void print(){
            System.out.println(real+" + "+imag+"i");
        }
        Complex(int r, int i){ // constructor function
            real = r;
            imag = i;
        }
        void add(Complex c){
            real = real + c.real;
            imag = imag + c.imag;
        }
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(10,20);
        c1.print();
        Complex c2 = new Complex(20,30);
        c1.add(c2);
        c1.print();
        }
}
