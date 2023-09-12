import java.util.Scanner;

public class PrimebR{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,m,i,j;
		boolean k;
		n=sc.nextInt();
		m=sc.nextInt();
		if(m<2)
		{
			System.out.println("No Primes less than 2");
		}
		else{
			while(n<2)
			{
				n++;
			}
			for(i=n;i<=m;i++)
			{
				k=false;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						k=true;
						break;
					}
				}
				if(k==false)
				System.out.print(i+" ");
			}
		}
	}
}