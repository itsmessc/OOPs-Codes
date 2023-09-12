import java.util.Scanner;

public class Add3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j,num,count=0;
        System.out.println("Enter elements in 2d array:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter element to find:");
        num=sc.nextInt();
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(num==a[i][j])
                {
                    count++;
                }
            }
        }
        System.out.println(num+" occured "+count+" times");
    }
}
