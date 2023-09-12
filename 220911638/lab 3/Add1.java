import java.util.Scanner;

public class Add1{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4};
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("1.Case1\n2.Case2");
		n=sc.nextInt();
		switch(n)
		{
			case 1:
				for(int i:arr)
				{
					for(int j:arr)
					{
						for(int k:arr)
						{
							for(int m:arr)
							{
								System.out.println(arr[i-1]+""+arr[j-1]+""+arr[k-1]+""+arr[m-1]);
							}
						}
					}
				}
				break;
			case 2:
				for(int i:arr)
				{
					for(int j:arr)
					{
						for(int k:arr)
						{
							for(int m:arr)
							{
								if(i!=j & i!=k & i!=m & j!=k & j!=m & k!=m)
								{
									System.out.println(arr[i-1]+""+arr[j-1]+""+arr[k-1]+""+arr[m-1]);
								}
							}
						}
					}
				}
				break;
				
		}
	}
}