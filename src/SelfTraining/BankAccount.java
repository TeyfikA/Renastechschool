package SelfTraining;

public class BankAccount {

   private String holderName;
   private long idNumber;
   private double balance;


    public BankAccount(String holderName, long idNumber, double balance) {
        this.holderName = holderName;
        this.idNumber = idNumber;
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "holderName= " + holderName + '\'' +
                ", idNumber= " + idNumber +
                ", balance= " + balance +
                '}';
    }
    public void deposit(double deposit){
        this.balance+=deposit;
        System.out.println("Account holder deposit amount of" + deposit);


    }
    public void withdraw(double withdraw){
        if(balance>0) {
            this.balance -= withdraw;
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        BankAccount ta =new BankAccount( "Teyfik", 56894523554l, 20000);
        System.out.println(ta.toString());
        System.out.println();
        ta.withdraw(3500);
        System.out.println(ta.getBalance());
        ta.deposit(20000);
        System.out.println(ta.getBalance());
        System.out.println("New balance is: "+ta.getBalance()+ "$");


    }

}




