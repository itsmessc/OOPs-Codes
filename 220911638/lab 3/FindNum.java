import java.util.Scanner;

public class FindNum{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]={1,2,3,1,2,1,5,6,7};
		int m;
		System.out.println("Enter Number to search");
		m=sc.nextInt();
		int ind=0;
		boolean k=false;
		for(int i:a)
		{
			
			if(m==i)
			{
				
				k=true;
				System.out.print("a["+ind+"] ");
			}
			ind++;
		}
		if(k==false)
		{
			System.out.println("Number not found");
		}
	}
}