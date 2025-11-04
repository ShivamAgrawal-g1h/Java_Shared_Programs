package Java_Language.Advanced;
/*
what is keep the familiar thread-per-task programming model?

The "familiar thread-per-task programming model" is a straightforward approach
to concurrent programming where a dedicated thread is assigned to handle a single,
specific operation or task (such as a user request or a database query) from start to finish.
 */
class T extends Thread{
    public void run(){
//        for(int i=0; i<8; i++){
//            System.out.println("New thread = "+i);
//        }
        try{// Displaying the thread that is running
            System.out.println("Thread "+ Thread.currentThread().threadId()+ " is running");
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
class MultiThreading1 {
    public static void main(String[] args) {
//        T obj = new T();
//        obj.start();
//        for(int j=0; j<8; j++){
//            System.out.println("main = "+j);
//        }
        int n = 5; // Number of threads
        for (int i = 0; i < 5; i++){
            T object = new T();
            object.start();
        }
    }
}
/*
User Level Threads (ULTs) are managed entirely by user-level libraries and do not require kernel intervention.
They are lightweight and provide fast thread switching but can suffer from blocking issues.
Kernel Level Threads (KLTs),on the other hand, are managed by the operating system's kernel.
They offer better concurrency and can take advantage of multi-core processors but have higher overhead due to kernel involvement.
A key difference is that ULTs are oblivious to the kernel's threading mechanism, while KLTs rely on it for scheduling and management.


User-level threads (ULTs), also known as green threads or lightweight threads, are a form of
threading where thread management is handled entirely by user-level code rather than the operating system kernel.
These threads are created and managed by a user-level thread library or a runtime environment without requiring
any kernel-level support. In contrast, kernel-level threads (KLTs) rely on the operating system to manage threads.

Kernel-level threads (KLTs), also known as native threads or heavyweight threads, are a form of threading where
thread management is handled by the operating system kernel. These threads are created and managed by the kernel
itself, and they rely on kernel-level support for their operation.
In contrast, user-level threads (ULTs) are managed entirely at the user level without kernel intervention.

 */