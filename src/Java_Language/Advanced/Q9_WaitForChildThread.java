package Java_Language.Advanced;
//👉 “Child thread” is NOT a technical term in Java.
//It is an informal / conceptual term used in questions and tutorials.
//
//What “child thread” actually means here?
//In Java exam language:
//Child threads = threads that were created and started by another thread

class Q9_WaitForChildThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> System.out.println("A"));
        Thread t2 = new Thread(() -> System.out.println("B"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();   // main waits for these "child threads"
        System.out.println("Main Thread Completed");
    }
}
