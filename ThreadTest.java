import java.util.*;
/*class MyRun implements Runnable{
    public void run(){}
}
public class ThreadTest {
    public static void main(String[] args){
        Thread t = new Thread(new MyRun(),"MY Name");
        
    }
}
 */
class MyThread extends Thread{
    public MyThread(String name)// Constructor
    {
        super(name);// Calls Thread's constructor
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
           try{
             Thread.sleep(100);
           }
           catch(InterruptedException e){
            System.out.print(e);
           }
        }
    }
}
public class ThreadTest{
    public static void main(String[] args){
        MyThread t = new MyThread("My Thread 1");
       // System.out.println(t.getId());
       // System.out.println(t.getName());
        //System.out.println(t.getPriority());
        t.start();
       // System.out.println(t.getState());
       // System.out.println(t.isAlive());
       t.interrupt();
    }
}


