import java.util.Scanner;

public class Matrixmul{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][],i,j,b[][],c[][],k,n,m,x,y;
		System.out.println("Enter order of matrix A:");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("Enter order of matrix B:");
		x=sc.nextInt();
		y=sc.nextInt();
		a= new int[n][m];
		c= new int[n][y];
		b= new int[x][y];
		if(a[0].length!=b.length)
		{
			System.out.println("Not possible");
			
		}
		else{
			System.out.println("Enter elements of matrix A");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter elements of matrix B:");
			for(i=0;i<x;i++)
			{
				for(j=0;j<y;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			if((n!=x) & (m!=y))
			{
				System.out.println("Addition not possible");
			}
			else{
				for(i=0;i<n;i++)
				{
					for(j=0;j<y;j++)
					{
						c[i][j]=a[i][j]+b[i][j];
					}
				}
				System.out.println("After addition");
				for(i=0;i<n;i++)
				{
					for(j=0;j<y;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<y;j++)
				{
					c[i][j]=0;
					for(k=0;k<m;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("After multiplication");
			for(i=0;i<n;i++)
			{
				for(j=0;j<y;j++)
				{
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
	}
}