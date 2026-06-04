class A{}
class B extends A{}

class superc{
    public void meth1(){System.out.println("meh1");}
    public void meth2(){System.out.println("meth2");}
}

class sub extends superc{
    public void meth2(){System.out.println("subclass meth 2");}
    public void meth3(){System.out.println("meth3");}
}

public class dynamicdispatch {
    public static void main(String[] args){
        sub s = new sub();
        s.meth1();
        s.meth2();
    }
}