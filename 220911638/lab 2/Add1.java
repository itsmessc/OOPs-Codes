import java.util.Scanner;
class Add1{
	public static void main(String args[]){
		Scanner lol = new Scanner(System.in);
		int a,b;
		a=lol.nextInt();
		b=lol.nextInt();
		System.out.println(((a<<2)+(b>>2)));
		System.out.println(b>0);
		System.out.println((a+b*100)/10);
		System.out.println(a&b);	
	}
}