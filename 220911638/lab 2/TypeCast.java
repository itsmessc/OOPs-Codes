import java.util.Scanner;
class TypeCast{
	public static void main(String args[]){
		Scanner leap=new Scanner(System.in);
		int a;
		double b;
		char c;
		a=leap.nextInt();
		b=leap.nextDouble();
		c=leap.next().charAt(0);
		System.out.println((byte)a);
		System.out.println((int)c);
		System.out.println((byte)b);
		System.out.println((int)b);	
	}
}