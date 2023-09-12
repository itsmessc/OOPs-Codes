import java.util.Scanner;

public class Add4 {
    static void sort(int a[])
    {
        int i,j,temp;
        int n=a.length;
        for(i=0;i<n-1;i++)
        {
            for(j=i;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        int i;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            c[i]=a[i];
        }
        for(i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
            c[i+a.length]=b[i];
        }
        sort(c);
        for(int j:c)
        {
            System.out.print(j+" ");
        }
    }
}
