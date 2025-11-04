package Java_Language.Advanced;
class T2 implements Runnable{
    public void run(){
        try {// Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().threadId() + " is running");
        } catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
class MultiThreading2 {
    public static void main(String[] args) {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new T2());
            object.start();
        }
    }
}