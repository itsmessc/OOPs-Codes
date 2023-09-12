import java.util.Scanner;

public class Add3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of rows");
        n=sc.nextInt();
        int i,j=1;
        for(i=1;i<n;i++)
        {
            for(int m=0;m<i;m++)
            {
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
