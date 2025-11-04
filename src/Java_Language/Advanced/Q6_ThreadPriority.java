package Java_Language.Advanced;
import java.lang.Thread.State;
class CookingTask extends Thread {
    private String task;
    CookingTask(String task) {
        this.task = task;
    }
    @Override
    public void run() {
        System.out.println(task + " is being prepared by " +
                Thread.currentThread().getName());
    }
}
class Q6_ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new CookingTask("Rice");
        Thread t2 = new CookingTask("Salad");
        Thread t3 = new CookingTask("Curry");
        Thread t4 = new CookingTask("Soup");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(8);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(t4.getPriority()+t1.getPriority());
    }
}
