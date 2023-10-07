
import java.util.Scanner;

class countstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter string to check");
        int c,w,v=0,l;
        s=sc.nextLine();
        c=s.length();
        w=(s.split(" ")).length;
        l=(s.split(". ")).length;
        s=s.toLowerCase();
        for(char i:s.toCharArray())
        {
            if(i=='a' || i=='e'||i=='i'||i=='o'||i=='u')
            {
                v++;

            }
        }
        System.out.println("Chars:"+c+" words:"+w+" lines:"+l+" vowels:"+v);
    }
}