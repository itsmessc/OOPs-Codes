class Fact{
	public static void main(String args[]){
		int a,fact=1,i;
		a=Integer.parseInt(args[0]);
		for(i=2;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is:"+fact);
	}
}