package Java_Language.Advanced;
class T3 extends Thread{
    private int counter = 0;
    @Override
    public void run() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " counter: " + counter);
    }
}
class MultiThreading3 {
    public static void main(String[] args) {
        System.out.println("Main thread starts execution");
        T3 task1 = new T3();
        //✔️ super() is called (object construction)
        //❌ No OS/JVM thread is created yet
        //👉 A thread is created only when start() is called, not when the object is constructed.
        // creates a Thread OBJECT in heap memory, not a running thread,
        // (as its parent class is Thread so it automatically calls super() to create
        // the object of type Thread when we do "new T3();")

        task1.setName("Original_1st_Thread_object");

        Thread shared_thread_1 = new Thread(task1,"Shared_Thread-A");
        Thread shared_thread_2 = new Thread(task1,"Shared_Thread-B");// passed task1 as a Runnable interface type task
        // we created only 1 T3 class type object(task1) and passed it to both Thread class constructors,
        // as a Runnable interface type task bcz :
        //    public Thread(Runnable task, String name) - Constructor signature
        // so we made 2 more thread objects A & B sharing the object of T3 type(referred by task1)

        shared_thread_1.start();
        shared_thread_2.start();
        task1.start();
        // ✔️ Race condition expected

        T3 task2 = new T3(); // this is an unshared T3 type object
        task2.setName("New_Unshared_Thread_Object");
        //✔️ Separate object → separate counter → no sharing
        task2.start();

    }
}
/*
 The ONLY rule that matters (memorize this)
 What gets shared depends ONLY on how many OBJECTS you create — not on whether you use Runnable or Thread.
 Everything else flows from this.

This is 99% true. The only time this rule "breaks" is with the static keyword.
If I changed the code to: private static int counter = 0;
Then, even Task2 (which I correctly called an "independent object") would share the counter with Task1.

Non-static: Shared per Instance (Object).
Static: Shared per Class (The whole blueprint).
 */