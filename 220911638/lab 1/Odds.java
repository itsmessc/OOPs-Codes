class Odds{
	public static void main(String args[]){
		int b;
		System.out.println("Odds between 1 and 100");
		for(b=1;b<=100;b++)
		{
			if(b%2!=0)
			{
				System.out.print(b+" ");
			}
		}
	}
}