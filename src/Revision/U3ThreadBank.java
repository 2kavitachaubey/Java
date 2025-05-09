package Revision;
class Banking{
    private double balance;
    public Banking(double b){
        this.balance = b;
    }
    public synchronized void deposit(double amount){
        System.out.println(Thread.currentThread().getName() + " Depositing the " + amount);
        balance = balance + amount;
        System.out.println("Deposit the amount : " + balance);
    }
    public synchronized  void withdrawal(double amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " Withdrawing the " + amount);
            balance = balance - amount;
            System.out.println("After withdrawal: " + balance);
            System.out.println();
        }
        else{
            System.out.println("Not Enough Balance");
        }
    }
}
class BankService implements Runnable{
    Banking b;
    BankService(Banking b){
        this.b = b;
    }
    double amount = Math.floor(Math.random()*1000 + 1);
    public void run(){
        b.deposit(amount);
        b.withdrawal(amount);
    }
}
public class U3ThreadBank {
    public static void main(String[] args) {
        Banking b = new Banking(2000);
        for(int i = 0 ;i<10;i++){
            Thread b1 = new Thread(new BankService(b), "User"+i );
            b1.start();
        }
    }
}
