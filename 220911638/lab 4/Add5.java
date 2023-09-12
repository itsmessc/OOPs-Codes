import java.util.Scanner;
import java.lang.Math;

public class Add5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j,trace=0;
        double norm=0;
        System.out.println("Enter elements in 2d array:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            trace+=a[i][i];
            for(j=0;j<3;j++)
            {
                
                norm+=Math.pow((double)a[i][j],2);
            }
        }
        norm=Math.sqrt(norm);
        System.out.println("Trace:"+trace+" Norm:"+norm);
    }
}
