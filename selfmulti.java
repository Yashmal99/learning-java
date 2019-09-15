/**
 * Created by Dell on 12-09-2019.
 */

 class thread1{
    Thread t;

   public void  threadcall() {
           t = Thread.currentThread();
           t.setName("thread 1");
           System.out.println("current thread " +t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread1: " + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1  interrupted.");
        }
        System.out.println("Exiting thread1.");
    }
}

public class selfmulti {

    public static void main(String args[]) {
        thread1 set = new thread1();
        set.threadcall();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread2: " + i);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread2  interrupted.");
        }
        System.out.println("Exiting thread2.");
    }
}
