import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m=0,r,l=0;
		n=sc.nextInt();
		r=n;
		while(n!=0)
		{
			l++;
			n=n/10;
		}
		n=r;
		while(n!=0)
		{
			m+=Math.pow((n%10),l);
			n=n/10;
		}
		if(r==m)
		System.out.println("Number is armstrong ");
		else
		System.out.println("Not Armstrong");
	}
}