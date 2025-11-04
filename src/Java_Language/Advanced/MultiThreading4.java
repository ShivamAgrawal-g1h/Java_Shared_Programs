package Java_Language.Advanced;
class T4 implements Runnable{
    private int counter = 0;
    @Override
    public void run() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " counter: " + counter);
    }
}
class MultiThreading4 {
    public static void main(String[] args) {
        T4 task1 = new T4(); // single shared object created in main thread
        Thread t1 = new Thread(task1,"Shared_thread-A"); // new thread object created ,other than main
        Thread t2 = new Thread(task1,"Shared_thread-B"); // "

        task1.run();
        System.out.println("Above count is of normal run() method call via task1 object in main thread.");

        t1.start(); // new threads sharing the same object task1
        t2.start();
        //✔️ New threads
        //✔️ Same object
        //✔️ Race condition possible

        // Now 3 threads are running - main , Shared_thread-A, Shared_thread-B

        task1.run();// task1 is an object in main thread itself , not an independent thread, it's just a normal method call

        T4 task2 = new T4();
        task2.run(); // just a method call
        // ✔️ Independent object
        //✔️ No sharing
    }
}
