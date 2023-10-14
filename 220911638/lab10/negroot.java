import java.util.*;
import java.lang.Math;
class Myexp extends Exception{
    public Myexp(String m)
    {
        super(m);
    }
}
public class negroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        i=sc.nextInt();
        try
        {
            if(i<0)
            {
                throw new Myexp("Expected positive number");
            }
            System.out.println(Math.sqrt(i));
        }
        catch(Myexp e)
        {
            System.out.println("Caught:"+e.getMessage());
        }
    }
}
