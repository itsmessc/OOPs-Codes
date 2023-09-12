
public class Numtri{
	public static void main(String args[])
	{
		int n[]={1,2,3,4,5};
		for(int i:n)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}