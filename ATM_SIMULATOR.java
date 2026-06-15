import java.util.Scanner;

class Account{
    private String Account_NO;
    private String pin;
    private double balance;
    private String HolderName;

    public Account(String Account_NO,String pin,double balance,String HolderName){
        this.Account_NO = Account_NO;
        this.pin = pin;
        this.balance = balance;
        this.HolderName = HolderName;
        }
    public boolean validatepin(String inputpin){
        return this.pin.equals(inputpin);
    }
    public double getbalance(){return balance;}
    public String getAccNo(){return Account_NO;}
    public String getHolderName(){return HolderName;}

    public boolean WithdrawAmount(double amount){
        if(amount > balance || amount <= 0)return false;
        balance  -= amount;
        return true;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
class ATM{
    private Account currentaccount;
    Scanner sc = new Scanner(System.in);

    private Account[] account = {
        new Account("1001", "1234", 10000, "Sarth"),
        new Account("1002", "4321", 11000,"Muskan")
    };

    private Account findAccount(String accno){
        for(Account acc : account){
            if(acc.getAccNo().equals(accno)) return acc;
        }
        return null;
    }

    public boolean login(){
        System.out.println("Enter the account number : ");
        String accno = sc.nextLine();
        currentaccount = findAccount(accno);
        if(currentaccount == null){
            System.out.print("No Account Found ");
            return false;
        }
        System.out.println("Enter the Pin: ");
        String pin = sc.nextLine();
        if(!currentaccount.validatepin(pin)){
            System.out.print("Wrong Pin");
            return false;
        }
        System.out.println("Welcome, " + currentaccount.getHolderName() + "!");
        return true;
    }
    public void showMenu() {
        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: checkBalance(); break;
                case 2: deposit();      break;
                case 3: withdraw();     break;
                case 4: System.out.println("Thank you. Goodbye!"); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }

    private void checkBalance(){
        System.out.print("The account balance is "+currentaccount.getbalance());
    }

    private void deposit(){
        System.out.print("Enter amount to deposit: Rs. ");
        double amount = Double.parseDouble(sc.nextLine());
        currentaccount.deposit(amount);
        System.out.println("Deposited. New Balance: Rs. " + currentaccount.getbalance());
    }

    private void withdraw(){
        System.out.print("Enter amount to Withdraw: Rs. ");
        double amount = Double.parseDouble(sc.nextLine());
        if(currentaccount.WithdrawAmount(amount)){
            System.out.println("Dispensing Rs. " + amount);
            System.out.println("Remaining Balance: Rs. " + currentaccount.getbalance());
        }else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}


public class ATM_SIMULATOR {
    public static void main(String[] args){
        ATM atm = new ATM();
        System.out.println("===== Welcome to the ATM =====");
        if (atm.login()) {
            atm.showMenu();
        }
    }
}
