class NegativeDimentionException extends Exception{
    public String toString(){
        return "Dimensions of a Rectangle cannot be Negative";
    }
}


public class throwarea {
    static int area(int l,int b)throws NegativeDimentionException{
        if(l < 0 || b < 0){
            throw new NegativeDimentionException();
        }
        return l*b;
    }
    static void meth1()throws NegativeDimentionException{
        System.out.print(area(-10,5));
    }
    public static void main(String[] args){
        try{
            meth1();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
