import java.util.Scanner;
class Numarr{
    int a[]=new int[6];
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
            System.out.println(a[i]);
        }
    }
    void isplaindrome(){
        int count=0;
        for(int j:a)
        {
            System.out.println(j);
            int m=j,r=0,b=0,n=0;
            while(m>0)
            {
                r=m%10;
                b=b*10+r;
			    m=m/10;
            }
            if(b==j)
                count++;
        }
        System.out.println("Palindrome:"+count);
        

    }
    void isPrime(){
        int count=0;
        boolean l=false;
        for(int q:a)
        {
            
            for(int u=2;u<q;u++)
            {
                if(q%u==0)
                {
                    l=true;
                    break;

                }

            }
            if(l==false)
            {
                count++;
            }
        }
        System.out.println("primes:"+count);
    }
    void isOdd()
    {
        
        int count=0;
        for(int j:a)
        {
            System.out.println(j);
            if(j%2!=0)
            {
                count++;
            }
        
        }
        System.out.println("Odds:"+count);
            
    }
}

public class question {
    public static void main(String[] args) {
        Numarr l=new Numarr();
        l.getdata();
        l.isPrime();
        l.isplaindrome();
        l.isOdd();
    }
}
