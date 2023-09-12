import java.util.Scanner;

public class Add1{
    static boolean prime(int i)
    {
        int j;
        if(i<2)
        {
            return false;
        }
        boolean k=false;
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
                k=true;
                break;
            }
        }
        if(k==false)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[];
        a=new int[5];
        System.out.println("Enter elements in array");
        for(int j=0;j<5;j++)
        {
            a[j]=sc.nextInt();
        }
        for(int i:a)
        {
            if(prime(i)==true)
            System.out.println(i);
        }

    }
   
}