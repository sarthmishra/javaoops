class MineData{
    int value;
    boolean flag = true;

    synchronized public void set(int v){
        while(!flag){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        value = v;
        flag = false;
        notify();
    }

    synchronized public int get(){
        while(flag){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        int x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread{
    MineData data;
    public Producer(MineData d){
        data = d;
    }
    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread{
    MineData data;
    public Consumer(MineData d){
        data = d;
    }
    public void run(){
        int value;
        while(true){
            value = data.get();
            System.out.println("Consumer " + value);
        }
    }
}

public class InterProcess {
    public static void main(String[] args){
        MineData d = new MineData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
