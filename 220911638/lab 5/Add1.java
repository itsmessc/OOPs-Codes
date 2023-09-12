import java.util.Scanner;

class Result{
    int a[][]=new int[3][4];
    int b[]=new int[3];
    Result()
    {

    }
    Result(int i,int r,int m,int n,int o)
    {
        a[i][0]=r;
        a[i][1]=m;
        a[i][2]=n;
        a[i][3]=o;
    }
    void total()
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            b[i]=0;
            for(j=0;j<4;j++)
            {
                b[i]+=a[i][j];
            }
        }
    }
    void maxinsub()
    {
        int i,j,max1,max2=0,l=0,p=0;
        for(i=0;i<3;i++)
        {
            max1=0;
            if(max2<b[i])
            {
                max2=b[i];
                p=i;
            }
            for(j=0;j<3;j++)
            {
                if(max1<a[j][i+1])
                {
                    max1=a[j][i+1];
                    l=j;
                }
            }
            System.out.println("Max in subject "+(i+1)+" is "+max1+" Roll no:"+a[l][0]);
        }
        System.out.println("Max total marks:"+max2+" Rollno:"+a[p][0]);
    }
}
public class Add1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Result z=new Result();
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter roll,marks in 3 subjects");
            z.a[i][0]=sc.nextInt();
            z.a[i][1]=sc.nextInt();
            z.a[i][2]=sc.nextInt();
            z.a[i][3]=sc.nextInt();
        }
        z.total();
        z.maxinsub();

    }
}
