package lab10;
import java.util.*;

class Myexp extends Exception{
    public Myexp(String m)
    {
        super(m);
    }
}
public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        try{
            if(m!=n)
            {
                throw new Myexp("It is not a square matrix");
            }
            int i,j;
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Square Matrix:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
        catch(Myexp e)
        {
            System.out.println("Caught:"+e.getMessage());
        }
    }
}
