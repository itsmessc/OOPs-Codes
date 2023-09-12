import java.util.Scanner;

public class Symmetric{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][],i,j;
		a= new int[3][3];
		boolean k=false;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		outer: for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					System.out.println("Not a symmetirc matrix");
					k=true;
					break outer;
				}
			}
		}
		if(k==false)
		{
			System.out.println("A symmetric matrix");
		}
	}
}