package lab10;
import java.util.*;
public class studentexcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int r,m1,m2,m3;
        try{
            name=sc.nextLine();
            r=Integer.parseInt(sc.nextLine());
            m1=Integer.parseInt(sc.nextLine());
            m2=Integer.parseInt(sc.nextLine());
            m3=Integer.parseInt(sc.nextLine());
            float p=(float)(m1+m2+m3);
            p/=3;
            float grade=p/10;
            System.out.println(p+" "+grade);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid number entered");
        }

    }
}
