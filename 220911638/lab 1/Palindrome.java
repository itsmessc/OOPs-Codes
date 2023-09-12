class Palindrome{
	public static void main(String args[]){
		int a,b=0,r=0,n=0;
		a=Integer.parseInt(args[0]);
		n=a;
		while(a>0)
		{
			r=a%10;
			b=b*10+r;
			a=a/10;
		}
		if(n==b)
		{
			System.out.println("Entered number is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}