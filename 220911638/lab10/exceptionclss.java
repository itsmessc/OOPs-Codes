package lab10;
import java.util.*;

class Myexp extends Exception{
    public Myexp(String m)
    {
        super(m);
    }
}
public class exceptionclss {
    public static void main(String[] args) {
        int m=6;
        try{
            if(m>5)
            {
                throw new Myexp("Number greater than 5");
            }
        }
        catch(Myexp e)
        {
            System.out.println("Caught "+e.getMessage());
        }
    }
}
