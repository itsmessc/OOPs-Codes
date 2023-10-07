import java.util.*;

public class repeatreplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2,s3="";
        System.out.println("Enter main string");
        s1=sc.nextLine();
        System.out.println("Enter replacing string");
        s2=sc.nextLine();
        int l=s1.length(),a[]=new int[l],i;
        char v;
        for(i=0;i<l;i++)
        {
            if(a[i]==1)
                continue;
            
            for(int j=i+1;j<l;j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    a[i]=1;
                    a[j]=1;
                }
            }
        }
        for(i=0;i<l;i++)
        {
            if(a[i]==1)
            {
                s3=s3+s2;
            }
            else
                s3=s3+s1.charAt(i);
        }
        System.out.println(s3);
    }
}
