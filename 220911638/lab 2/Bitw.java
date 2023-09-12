import java.util.Scanner;
class Bitw{
	public static void main(String args[]){
		Scanner leap=new Scanner(System.in);
		int a;
		a=leap.nextInt();
		System.out.println("Division:"+(a>>1));
		System.out.println("Multiplication:"+(a<<1));			
	}
}