import java.util.Scanner;
class Add2{
	public static void main(String args[]){
		Scanner lol = new Scanner(System.in);
		int a,b,c,max,min;
		a=lol.nextInt();
		b=lol.nextInt();
		c=lol.nextInt();
		max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		min=(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
	}
}