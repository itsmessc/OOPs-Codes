import java.util.Scanner;

class Account{
    String name,type,accno;
    double balance=1500;
    void deposit(double depo)
    {
        balance+=depo;
    }
    void withdraw(double with)
    {
        if(balance<with)
        {
            System.out.println("Insufficient Balance");
        }
        else
        balance-=with;
    }
    void display()
    {
        System.out.println("Accno:"+accno+" Name:"+name+" Type:"+type+" Balance:"+balance);
    }
}
class Savings extends Account{
    Savings(){
        type="Savings";
    }
    Savings(String n,String a){
        name=n;
        accno=a;
        type="Savings";
    }
    void intrest()
    {
        System.out.println("Intrest added:"+(balance*2.7/100));
        balance+=(balance*2.7/100);
    }
}
class Current extends Account{
    double min_bal=1000;
    double tax=38.5;
    Current()
    {
        type="Current";

    }
    Current(String n,String a)
    {
        name=n;
        accno=a;
        type="Current";
    }
    void withdraw(double with)
    {
        if(with<=balance)
        {
            System.out.println("Amount withdrawn:"+with);
            balance-=with;
        }
        else
            System.out.println("Insufficient funds");
        if(balance<min_bal)
        {
            if(balance<tax)
            balance=0;
            else
            {
                balance-=tax;
            System.out.println("Balance less than minimum balance,serivce tax charged");
            }
        }
    }
}

public class Bankacc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch='y';
        do{
            System.out.println("Create\n1.Savings Account\n2.Current Account\n");
            int a;
            a=sc.nextInt();
            switch(a){
                case 1:
                    int b;
                    Savings sav;
                    System.out.println("Enter name,accno:");
                    sc.nextLine();
                    sav=new Savings(sc.nextLine(),sc.nextLine());
                    System.out.println("1.deposit\n2.withdrawn\n3.Instrest\n4.exit");
                    b=sc.nextInt();
                    while((b==1)||(b==2)||(b==3))
                    {
                        if(b==1)
                        {
                            System.out.println("Enter amount:");
                            sav.deposit(sc.nextDouble());
                        }
                        else if(b==2)
                        {
                            System.out.println("Enter amount:");
                            sav.withdraw(sc.nextDouble());
                        }
                        if(b==3)
                        {
                            sav.intrest();
                        }
                        sav.display();
                        System.out.println("1.deposit\n2.withdrawn\n3.Instrest\n4.exit");
                        b=sc.nextInt();
                    }
                    break;
                case 2:
                    int c;
                    Current curr;
                    System.out.println("Enter name,accno:");
                    sc.nextLine();
                    curr=new Current(sc.nextLine(),sc.nextLine());
                    System.out.println("1.deposit\n2.withdrawn\n3.exit");
                    c=sc.nextInt();
                    while((c==1)||(c==2))
                    {
                        //curr.display();
                        System.out.println("Enter amount:");
                        if(c==1)
                        {
                            curr.deposit(sc.nextDouble());
                        }
                        else if(c==2)
                        {
                            curr.withdraw(sc.nextDouble());
                        }
                        curr.display();
                        System.out.println("1.deposit\n2.withdrawn\n3.exit");
                        c=sc.nextInt();
                    }
                    break;
            }
            System.out.println("(y/n)");
            ch=sc.next().charAt(0);

        }while(ch=='y');
    }
}