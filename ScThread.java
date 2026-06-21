class ATM{
    synchronized public void checkBalance(String name){
       System.out.printf("%s is checking",name);
       try{Thread.sleep(1000);}catch(Exception e){}
       System.out.print("Balance");
    }
    synchronized public void withdraw(String name,int amount){
        System.out.printf("%s is withdrawing ",name);
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.print(amount);
    }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int amount;

    public Customer(String n, ATM a, int amt){
        name = n;
        atm = a;
        amount = amt;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run(){
        useATM();
    }

}


public class ScThread {
    public static void main(String[] args){
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();
    }
}
