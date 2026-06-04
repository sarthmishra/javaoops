abstract class Super{
    public Super(){System.out.println("this is super constructor");}
    public void meth1(){System.out.println("this is method 1");}
    abstract public void meth2();
}
class sub extends Super{
    public void meth2(){
        System.out.println("this is method 2");
    }
}


public class abstractexample {
    public static void main(String[] args){
        Super s = new sub();
        s.meth1();
        s.meth2();
    }
}
