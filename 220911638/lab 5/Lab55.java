import java.lang.Math;
class Number{
    private double num;
    Number()
    {
        num=0;
    }
    Number(int a)
    {
        num=a;
    }
    boolean isZero()
    {
        if(num==0)
            return true;
        return false;
    }
    boolean isPositive()
    {
        if(num>0)
            return true;
        return false;
    }
    boolean isNegative()
    {
        if(num<0)
            return true;
        return false;
    }
    boolean isOdd()
    {
        if(num%2!=0)
            return true;
        return false;
    }
    boolean isEven()
    {
        if(num%2==0)
            return true;
        return false;
    }
    boolean isPrime()
    {
        int i;
        for(i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    boolean isArmstrong()
    {
        int r,l=0,m=0;
        r=(int)num;
		while(r!=0)
		{
			l++;
			r=r/10;
		}
		num=r;
		while(r!=0)
		{
			m+=Math.pow((r%10),l);
			r=r/10;
		}
		if(num==m)
		return true;
		else
		return false;
    }
}
public class Lab55 {
    public static void main(String[] args) {
        Number a=new Number(153);
        System.out.println(a.isZero());
        System.out.println(a.isPositive());
        System.out.println(a.isNegative());
        System.out.println(a.isOdd());
        System.out.println(a.isEven());
        System.out.println(a.isPrime());
        System.out.println(a.isArmstrong());
    }
}
