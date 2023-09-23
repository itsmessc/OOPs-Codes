import java.util.Scanner;

interface market{
    void sales();
}

class Hardware implements market{
    static int count;
    String cate,manu;
    Hardware()
    {
        count++;
    }
    Hardware(String c,String m)
    {
        cate=c;manu=m;
        count++;
    }
    public void sales()
    {
        System.out.println("Total sales:"+count);
    }
}

class Software implements market{
    static int count;
    String soft,os;
    Software()
    {
        count++;
    }
    Software(String c,String m)
    {
        soft=c;os=m;
        count++;
    }
    public void sales()
    {
        System.out.println("Total sales:"+count);
    }
}
public class HS {

    public static void main(String[] args) {
        
        Software s=new Software("aaa","bbb");
        
        Hardware h=new Hardware("ccc","ddd");
        s.sales();
        h.sales();
    }
}