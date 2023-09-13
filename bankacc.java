import java.util.Scanner;
import java.lang.Math;

public class Account {
    String name;
    int acc_no;
    String type;
    double balance;
    double inter;
    double rate;
   
    Account(String n, int no, String t, double bal){
        name = n;
        acc_no = no;
        type = t;
        balance = bal;
    }
   
    void deposit(double amount){
        balance += amount;
        System.out.println(amount+" has been deposited into your account");
    }
   
    void display(){
        System.out.println("Your current balance is: "+balance);
    }
   
    void withdraw(double amount){
        if(balance < amount)
            System.out.println("Not enough funds");
        else{
            balance -= amount;
            System.out.println(amount+" has been withdrawn from your account");
        }
    }
   
    double calculate(double years){
        inter = balance * (Math.pow((1+rate/100), years));
        return inter;
    }
   
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, account no and initial balance");;
        String n = sc.nextLine();
        int no = sc.nextInt();
//        String t = sc.nextLine();
        double bal = sc.nextDouble();
       
//        if(t == "Savings"){
//            SavingsAccount a = new SavingsAccount(n,no,t,bal);
//        }
//        else if (t == "Current"){
//            System.out.println("Enter minimum balance");
//            double m = sc.nextDouble();
//            CurrentAccount a = new CurrentAccount(n,no,t,bal,m);
//        }
//        else
//            Account a = new Account(n,no,t,bal);
        SavingsAccount savings = new SavingsAccount(n,no,"Savings",bal);
        System.out.println("Enter minimum balance");
        double m = sc.nextDouble();
        CurrentAccount current = new CurrentAccount(n,no,"Current",bal,m);
       
        System.out.println("Savings account");
        savings.deposit(1000);
        savings.display();
        double inter = savings.calculate(5);
        System.out.println("Interest is "+inter);
        savings.withdraw(500);
        savings.display();
        savings.withdraw(1000);
       
        System.out.println("Current account");
        current.deposit(500);
        current.display();
        current.withdraw(600);
        inter = current.calculate(5);
        System.out.println("Interest is "+inter);
        current.display();
   
    }
}

class CurrentAccount extends Account{
    double rate = 0;
    double min = 1000;
    int tax = 0;
   
    CurrentAccount(String n, int no, String t, double bal, double m){
        super(n,no,t,bal);
        min = m;
    }
   
    void withdraw(double amount){
        if(balance - amount < min){
            System.out.println("Below minimum balance");
            tax = 18;
        }
       
        if(balance < amount)
            System.out.println("Not enough funds");
        else{
            balance -= amount;
            System.out.println(amount+" has been withdrawn from your account");
        }
    }
   
    double calculate(double years){
        return balance*(Math.pow((1+tax/100),years));
    }
}

class SavingsAccount extends Account{
    double rate = 5;
   
    SavingsAccount(String n, int no, String t, double bal){
        super(n,no,t,bal);
    }
   
    double calculate(double years){
        inter = balance * (Math.pow((1+rate/100), years));
        return inter;
    }
}
