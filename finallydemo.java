public class finallydemo {
    public static void main(String[] args){
        try{
            System.out.print(10/0);
        }
        catch(Exception e){
            System.out.print(e);
        }
        finally{
            System.out.print("final answer");
        }
    }
}
/*package finallydemo;

public class FinallyDemo 
{
    static void meth1()throws Exception
    {
        try
        {
            
        throw new Exception();
        }
        finally
        {
           //this message willdefinitly execute 
        System.out.println("Final Message");
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        meth1();
    }   
} */