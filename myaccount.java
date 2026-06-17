class Account1{
    private String acc_no;
    private String Name;
    private String Address; 
    private int Ph_no;
    private int dob;
    protected int balance;

 public Account1(String acc_no,String Name,String Address,int Ph_no,int dob,int balance){
        this.acc_no = acc_no;
        this.Name = Name;
        this.Address = Address;
        this.Ph_no = Ph_no;
        this.dob = dob;
        this.balance = balance;
    }
    public String getacc(){return acc_no;}
    public String getName(){return Name;}
    public String getAddress(){return Address;}
    public int getPhone(){return Ph_no;}
    public int getdob(){return dob;}
    public int getbalance(){return balance;}

    public void setAdd(String add){
        Address = add;
    }
    public void setphone(int ph){
        Ph_no = ph;
    }


}
class savingsAccount1 extends Account1{
    public savingsAccount1(String acc_no,String Name,String Address,int Ph_no,int dob,int balance){
        super(acc_no,Name,Address,Ph_no,dob,balance);
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }

}
class LoanAccount extends Account1{
    public LoanAccount(String acc_no,String Name,String Address,int Ph_no,int dob,int balance){
        super(acc_no,Name,Address,Ph_no,dob,balance);
    }
     public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }

}


public class myaccount {
    public static void main(String[] args){
        

    }
}
