import java.util.Arrays;
import java.util.Scanner;

public class menu1 {
    public static void main(String[] args) {
        String s1,s2,s3;
        boolean k=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        s1=sc.nextLine();
        
        StringBuffer s;
        do
        {
            System.out.println("String Menu");
            System.out.println("1.Palindrome");
            System.out.println("2.Alphabetical order");
            System.out.println("3.Reverse");
            System.out.println("4.Concat");
            int i;
            i=sc.nextInt();
            switch(i)
            {
                case 1:
                    s=new StringBuffer(s1);
                    s.reverse();
                    s2=s.toString();
                    if(s1.compareTo(s2)!=0)
                        System.out.println("Not a palindome");
                    else 
                        System.out.println("Palindrome");
                    break;
                case 2:
                    char c[]=s1.toCharArray();
                    Arrays.sort(c);
                    s2=new String(c);
                    System.out.println(s2);
                    break;
                case 3:
                    s=new StringBuffer(s1);
                    s.reverse();
                    s2=s.toString();
                    System.out.println(s2);
                    break;
                case 4:
                    s=new StringBuffer(s1);
                    s.reverse();
                    s2=s1;
                    s3=s.toString();
                    s2=s2+s3;
                    System.out.println(s2);
                    break;
                case 5:
                    System.exit(0);
            }
        }while(true);
    }    
}
