/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class Account{
    String name, acc_no,type;
    float balance=1000;
    
    void deposit(float amount)
    {
        balance+=amount;
    }
    void withdraw(float amount)
    {
        if(amount>balance)
        {
            System.out.println("Not enough Balance :(");
            return;
        }
        balance-=amount;
    }
    void display()
    {
        System.out.println("\nName: "+name+"\nacc no: "+acc_no+"\nType: "+type+" account\nBalance: "+balance+"\n");
    }
}
class CurrentAcc extends Account{
    final int min_balance = 1000;
    final int service_tax=100;
    CurrentAcc()
    {
        type="current";
    }
    CurrentAcc(String name,String acc_no)
    {
        this.name=name;
        this.acc_no=acc_no;
        type="current";
    }
    void withdraw(float amount)
    {
        
        if(amount>balance-service_tax)
        {
            System.out.println("Not enough Balance :(");
            return;
        }
        balance-=amount;
        if(balance<min_balance)
        {
            System.out.println("Balance is less than minimum balance, service tax charged");
            balance-=service_tax;
        }
    }
}
class SavingsAcc extends Account{
    
    SavingsAcc(){
        type="savings";
    }
    SavingsAcc(String name,String acc_no)
    {
        this.name=name;
        this.acc_no=acc_no;
        type="savings";
    }
    double intrest()
    {
        return balance*0.12;
    }
    
}
public class BankAcc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch='y';
        while(ch=='y')
        {
            System.out.println("Create \n1.Current account\n2.Savings account");
            ch = sc.nextLine().charAt(0);
            if(ch=='1' || ch=='2'){
                if(ch=='1')
                {
                    CurrentAcc acc;
                    System.out.println("Enter name and acc no");
                    acc=new CurrentAcc(sc.nextLine(),sc.nextLine());
                    acc.display();
                    System.out.println("1.Withdraw\n2.Deposit\n3.exit");
                    int op = sc.nextInt();
                    while(op==1||op==2){
                        
                        if(op==1||op==2||op==3)
                        {
                            System.out.print("amount: ");
                            if(op==1)
                            {
                                acc.withdraw(sc.nextFloat());
                            }
                            if(op==2)
                            {
                                acc.deposit(sc.nextFloat());
                            }
                            
                            acc.display();
                            System.out.println("1.Withdraw\n2.Deposit\n3.exit");
                            op = sc.nextInt();
                        }
                    }
                }
                else
                {
                    SavingsAcc acc;
                    System.out.println("Enter name and acc no");
                    acc=new SavingsAcc(sc.nextLine(),sc.nextLine());
                    acc.display();
                    System.out.println("1.Withdraw\n2.Deposit\n3.Intrest\n4.exit");
                    int op = sc.nextInt();
                    while(op==1||op==2||op==3){
                        
                        if(op==1||op==2||op==3)
                        {
                            System.out.print("amount: ");
                            if(op==1)
                            {
                                acc.withdraw(sc.nextFloat());
                            }
                            if(op==2)
                            {
                                acc.deposit(sc.nextFloat());
                            }
                            if(op==3)
                            {
                                acc.balance+=acc.intrest();
                            }
                            acc.display();
                            System.out.println("1.Withdraw\n2.Deposit\n3.Intrest\n4.exit");
                            op = sc.nextInt();
                        }
                    }
                }
            }
            System.out.println("continue? y/n");
            ch = sc.next().charAt(0);
        }
    }
    
}
