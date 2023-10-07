import java.util.Arrays;
import java.util.Scanner;

public class arrayofstr {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of strings");
        n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n],m;
        for(int i=0;i<n;i++)
        {
            
            
            s[i]=sc.nextLine();
        }
        Arrays.sort(s);
        for(String i:s)
        {
            System.out.println(i);
        }
    }
}
