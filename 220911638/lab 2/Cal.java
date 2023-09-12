import java.util.Scanner;
class Cal{
	public static void main(String args[]){
		Scanner leap=new Scanner(System.in);
		int num1,num2;
		float lol;
		char op,t;
		do{
		
			System.out.println("Enter num1 operator num2:");
			num1=leap.nextInt();
			op=leap.next().charAt(0);
			num2=leap.nextInt();
			switch(op){
				case 'x':
					System.out.println(num1*num2);
					break;
				case '+':
					System.out.println(num1+num2);
					break;
				case '-':
					System.out.println(num1-num2);
					break;
				case '/':
					System.out.println((float)num1/num2);
					break;
				default:
					System.out.println("Operator invalid");	
			
				}
		System.out.println("Do another (y/n)");
			t=leap.next().charAt(0);
		}while(t=='y');
	}
}