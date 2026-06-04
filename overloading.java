class Test{
    public int max(int a , int b){
        return a > b ? a : b;
    }
    public int max(int a , int b, int c){
        if(a> b && a > c) return a;
        else if(b > a && b  >c) return b;
        return c;
    }
}


public class overloading {
    public static void main(String[] args){
        Test s = new Test();
        s.max(3, 4,8);
        System.out.println(s.max(1,3,4));
    }
}
