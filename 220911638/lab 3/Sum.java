import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        double sum=0;
        int i,fact;
        for(i=1;i<10;i++)
        {
            fact=1;
            for(int j=1;j<=i;j++)
            {
                fact*=j;
            }
            sum=sum+((double)i/fact);
        }
        System.out.println("Sum="+sum);
    }
}
