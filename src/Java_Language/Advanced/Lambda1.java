package Java_Language.Advanced;
interface ZeroPara{
    void display();
}
class Lambda1 {
    public static void main(String[] args) {
        ZeroPara z = new ZeroPara() {
            @Override
            public void display() {
                System.out.println("Old");
                int x = 10;
                System.out.println(x*5);
            }
        };
        z.display();

        ZeroPara z2 = () -> {System.out.println("New"); int x = 10; System.out.println(x*4);};
        z2.display();
    }
}
