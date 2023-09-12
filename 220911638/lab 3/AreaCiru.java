import java.util.Scanner;

public class AreaCiru{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int l,b,area,circum;
		l=sc.nextInt();
		b=sc.nextInt();
		area=l*b;
		circum=2*(l+b);
		System.out.println(area);
		System.out.println(circum);
	}
}