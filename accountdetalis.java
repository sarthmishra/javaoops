class account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    private long balance;

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
{
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
    
}
