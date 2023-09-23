import java.util.Scanner;
class Bank{
    int accno=1212;
    double balance=1000;
    void getintrestrate()
    {

    }
    void display()
    {
        System.out.println("Accno:"+accno+" Balance:"+balance);
    }

}
class Sbi extends Bank{
    void getintrestrate()
    {
        System.out.println("Intrest added:"+(balance*8/100));
        balance+=(balance*8/100);
    }
}
class axis extends Bank{
    void getintrestrate()
    {
        System.out.println("Intrest added:"+(balance*7/100));
        balance+=(balance*7/100);
    }
}
class icici extends Bank{
    void getintrestrate()
    {
        System.out.println("Intrest added:"+(balance*9/100));
        balance+=(balance*9/100);
    }
}
public class Intrest {
    public static void main(String[] args) {
        Sbi s=new Sbi();
        axis a=new axis();
        icici i=new icici();
        s.getintrestrate();
        s.display();
        a.getintrestrate();
        a.display();
        i.getintrestrate();
        i.display();
    }
}
