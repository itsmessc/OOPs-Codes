import java.util.Scanner;

public class fivestrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[5],m="";
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter string "+(i+1));
            s[i]=sc.nextLine();
            m=m+s[i]+" ";
        }
        
        System.out.println(m);
    }
}
