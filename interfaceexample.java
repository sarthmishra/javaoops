class Phone{
    public void call(){System.out.print("Video call");}
    public void sms(){System.out.print("sms");}
}
interface Icamera{
    void click();
    void record();
}
interface ImusicPlayer{
    void play();
    void stop();
}
class smartphone extends Phone implements Icamera,ImusicPlayer{
    public void videocall(){System.out.println("Video calls : ");}
    public void click(){System.out.println("click : ");}
    public void record(){System.out.println("records : ");}
    public void play(){System.out.println("plays : ");}
    public void stop(){System.out.println("stops: ");}
    
}

public class interfaceexample {
    public static void main(String[] args){
        smartphone sp = new smartphone();
        sp.call();
        sp.click();
        sp.play();
        sp.sms();
    }
}
