class BankAccount {
    int balance = 1000;
    public synchronized void deposit(String tellerName, int amount){
        System.out.println(tellerName+"is depositing "+amount+" amount");
        balance += amount;
        System.out.println("New Balance is : balance.  "+balance);
    }

}
class Teller extends Thread{
    BankAccount money;
    String name;
    int amount;
    public Teller(BankAccount money,String name,int amount){
        this.money = money;
        this.name = name;
        this.amount = amount;
    }
    public void run(){
        for (int i = 0; i < 3; i++){
            try{
                Thread.sleep(2000);
                money.deposit(name, amount);
            }catch(Exception e){

            }
            
        }
    }


}


public class BankSimulation {
    public static void main(String[] args){
BankAccount account = new BankAccount();
 Teller t1 = new Teller(account, "Teller-A ", 500);
 Teller t2 = new Teller(account, "Teller-B ", 300);

    t1.start();
    t2.start();

    }//money sirf ek arrow hai jo BankAccount object ki 
    // taraf point karta hai — object ek hi hai, dono threads us tak money ke zariye pahunchte hain
}
