/*class testing extends Thread{
    public void run(){
        int i = 1;
        while(i == 10){
            System.out.print(i+"Hello" );
            i++;
        }
        
    }
}

public class treadtest {
    public static void main(String[] args){
        testing t = new testing();
        t.start();
        int i = 1;
        while(i ==10){
            System.out.print(i + " World");
            i++;
        }
    }
} */

class treadtest extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.print(i+"Hello" );
            i++;
        }
    }
    public static void main(String[] args){
        treadtest t = new treadtest();
        t.start();
        int i = 1;
        while(true){
            System.out.print(i + " World");
            i++;
        }
    }
}
/*class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}

class MyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    } */


/*public class ThreadTest //implements Runnable //extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    
    public static void main(String[] args) {
        
        //MyThread t=new MyThread();
        //ThreadTest t=new ThreadTest();
        MyRunnable t=new MyRunnable();
        Thread th=new Thread(t);
        
        th.start();
        
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
        }
        
    }
    
}*/