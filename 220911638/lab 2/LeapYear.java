import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		Scanner leap=new Scanner(System.in);
		int year;
		System.out.print("Enter Year to check:");	
		year=leap.nextInt();
		boolean t;
		if(year%4!=0)
		{
			t=false;	
		}
		
		else if(year%100!=0)
		{
			t=true;	
		}
			
		else if(year%400!=0)
		{
			t=false;	
		}
		else
		{
			t=true;	
		}
		if(t==true)
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
		
	}
}