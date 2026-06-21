class YourThread extends Thread{
    public void run(){
        int i = 1;
    while(true){
        System.out.print(i+" ");
        i++;
        }
        
    }
}

public class daemonthreadexample {
    public static void main(String[] args){
        YourThread t = new YourThread();
        t.setDaemon(true);//dependent threads if the main application is terminating  daemon thread will also terminate
        t.start();//as main method ends thread is also terminated
        //usually the main waits for the thread to finish 
        try{
            Thread.sleep(100);}
        
        catch(Exception e){}

    }
}
