import java.util.Scanner;

public class Magicsquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][];
        a=new int[3][3];
        int i,j;
        System.out.println("Enter the elements of the matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for(i=0;i<3;i++)
        {
            sum1+=a[i][i];
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sum2+=a[i][j];
            }
            if(sum2!=sum1)
            {
                System.out.println("Entered is not magic square");
                System.exit(0);
            }
            sum2=0;
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sum2+=a[j][i];
            }
            if(sum2!=sum1)
            {
                System.out.println("Entered is not magic square");
                System.exit(0);
            }
            sum2=0;
        }
        System.out.println("Entered is magic square");
    }
}