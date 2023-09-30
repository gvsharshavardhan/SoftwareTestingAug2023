package oops;

public class BankAccount {
    int balance = 600;
    String username;
    String password;

   static String bankcode;
   static String branchcode;


    //const will not have any return type

    //no arg const or default const
    BankAccount(int balance, String username, String password){
        this.balance = balance;
        this.username = username;
        this.password = password;
    }

    void setBalance(int amt) {
        balance = amt;
    }

    void setUsername(String username) {
        this.username = username;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    int returnMyBalance() {
        return balance;
    }

    int withDrawAmountAndReturnTheAmount(int amount) {
        balance = balance - amount;
        return balance;
    }


}