import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[],i;
        a=new int[5];
        System.out.println("Enter elements of array");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=0,min=0;
        min=a[0];
        for(int j:a)
        {
            if(max<j)
            {
                max=j;
            }
            if(min>j)
            {
                min=j;
            }
        }
        System.out.println("Max="+max+" Min="+min);
    }
}
