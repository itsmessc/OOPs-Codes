import java.util.Scanner;

public class Add5 {
    static double square(double a)
    {
        return a*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double a;
        a=sc.nextDouble();
        System.out.println("Square of "+a+" is:"+square(a));
    }
}
