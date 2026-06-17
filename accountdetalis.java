class account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

public account(String acc, String n,String add,String phn, String dob){
    accNo = acc;
    name = n;
    address = add;
    phno = phn;
    this.dob= dob;
    balance = 0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
    


}
class SavingsAccount extends account
/*Implicit super constructor account() is undefined for default constructor. Must define an explicit constructor MEANS
This error means that your child class is trying to call a parent class constructor that doesn't exist. */
{
    public SavingsAccount(String acc, String n, String add, String phn, String dob) {
        super(acc, n, add, phn, dob);
    }

    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends account
{
    public LoanAccount(String acc, String n, String add, String phn, String dob) {
        super(acc, n, add, phn, dob);
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



public class accountdetalis {
    public static void main(String[] args){

        SavingsAccount s = new SavingsAccount(
                "SB101",
                "Sarth",
                "Delhi",
                "9876543210",
                "12-05-2004");

        s.deposit(10000);
        s.withdraw(2500);

        System.out.println("Savings Account");
        System.out.println("----------------");
        System.out.println("Account No : " + s.getAccNo());
        System.out.println("Name       : " + s.getName());
        System.out.println("Balance    : " + s.getBalance());

        System.out.println();

        LoanAccount l = new LoanAccount(
                "LN201",
                "Rahul",
                "Mumbai",
                "9988776655",
                "15-08-2003");

        l.repay(500000);
        l.payEMI(25000);

        System.out.println("Loan Account");
        System.out.println("----------------");
        System.out.println("Account No : " + l.getAccNo());
        System.out.println("Name       : " + l.getName());
        System.out.println("Loan Left  : " + l.getBalance());
    }
        
    }
    

