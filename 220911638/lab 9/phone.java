import java.util.Scanner;
public class phone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[4];
        System.out.println("Enter phone number:");
        s[0]=sc.nextLine();
        s[1]=s[0].substring(1,4 );
        s[2]=s[0].substring(6,9);
        s[3]=s[0].substring(10,14);
        System.out.println("Area code:"+s[1]);
        System.out.println("Phone number:"+s[2]+" "+s[3]);
    }
}
