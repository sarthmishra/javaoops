//make the main method join the other thread
class MThread extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.print(i + " ");
            i++;
        }
    }
}

public class jointhread {
    public static void main(String[] args){
        MThread m = new MThread();
        m.setDaemon(true);
        m.start();
        Thread mainThread = Thread.currentThread();
        try{mainThread.join();}
        catch(Exception e){}
    }
}
//similarly yeild make the method it is declared in wait for soemtime as a result it is printed and called lesser number of times
