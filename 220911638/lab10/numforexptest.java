package lab10;

import java.util.*;
public class numforexptest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int n;
        try{
            n=Integer.parseInt(s);
            System.out.println("Integer is:"+n);
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException occured");
        }
    }
}
