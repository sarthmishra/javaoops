class LowBalanceException extends Exception{

    public String toString(){
        
        return "Balance should not be less than 5000";
    }

}

public class checkedunchecked {
        static void fun1(){
            try{
                throw new LowBalanceException();
            }
            catch(LowBalanceException e){
                System.out.print(e);
            }
            /*try{
                int a = 0,b = 10,c;
                c = b/a;
            }
            catch(Exception e){
                System.out.print(e);
                e.printStackTrace();
            } */
        }
        static void fun2(){
            fun1();
        }
        static void fun3(){
            fun2();
        }
        public static void main(String[] args){
            fun3();
        }
    
}
