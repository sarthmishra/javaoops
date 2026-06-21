class MyData{
    public void Display(String str){
        synchronized(this){
            for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            }
        }
    }
}

class MyThread2 extends Thread{
    MyData d;// 1. A REFERENCE VARIABLE declared inside the thread
    public MyThread2(MyData d){// 2. Constructor ACCEPTS a MyData object
        this.d = d; // 3. Stores it in the instance variable
    }
    public void run(){
        d.Display("Hello World ");// 4. Uses it when thread runs
    }
}
class MyThread3 extends Thread{
    MyData d;
    public MyThread3(MyData d){
        this.d = d; 
    }
    public void run(){
        d.Display("Welcome All ");
    }
}


public class SynchronisationDemo {
    public static void main(String[] args){
         MyData data = new MyData();       // One shared MyData object created

    MyThread2 t1 = new MyThread2(data); // data's reference passed → t1.d = data
    MyThread3 t2 = new MyThread3(data); // same reference passed  → t2.d = data
    t1.start();
    t2.start();
    }
}
