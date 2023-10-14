import java.util.*;

public class threefromfive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter String");
        s=sc.nextLine();
        char c[]=s.toCharArray();
        int i,j,k;
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<s.length();j++)
            {
                if(i==j)
                {
                    continue;
                }
                for(k=0;k<s.length();k++)
                {
                    if((j==k) || (i==k))
                    {
                        continue;
                    }
                    System.out.println(c[i]+""+c[j]+""+c[k]);
                }
            }
        }
    }
}
