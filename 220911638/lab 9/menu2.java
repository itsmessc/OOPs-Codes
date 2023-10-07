import java.util.*;



public class menu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2,s;
        System.out.println("Enter string 1:");
        s1=sc.nextLine();
        System.out.println("Enter string 2:");
        s2=sc.nextLine();
        char m;
        int f,l=-1;
        boolean k=false;
        do
        {
            System.out.println("Enter choice:\n1- compare strings\n2- case inversion\n3- check for substring\n4- if its a substring replace it by hello\n5- exit");
            f=sc.nextInt();
            switch(f)
            {
                case 1:
                    if(s1.compareTo(s2)>0)
                    {
                        System.out.println("1st greater than 2nd");
                    }
                    else if(s1.compareTo(s2)==0)
                    {
                        System.out.println("Both are same");
                    }
                    else 
                        System.out.println("1st smaller than 2nd");
                    break;
                case 2:
                s="";
                    for(int i=0;i<s1.length();i++)
                    {
                        m=s1.charAt(i);
                        if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
                        {
                            m=(char)(m-32);
                            s=s+m;
                        }
                        else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
                        {
                            m=(char)(m+32);
                            s=s+m;
                        }
                        else
                            s=s+m;
                    }
                    System.out.println(s);
                    s="";
                    for(int i=0;i<s2.length();i++)
                    {
                        m=s2.charAt(i);
                        if(s2.charAt(i)>='a' && s2.charAt(i)<='z')
                        {
                            
                            m=(char)(m-32);
                            s=s+m;
                        }
                        else if(s2.charAt(i)>='A' && s2.charAt(i)<='Z')
                        {
                            m=(char)(m+32);
                            s=s+m;
                        }
                        else
                            s=s+m;
                    }
                    System.out.println(s);
                    break;
                case 3:
                    l=-1;
                    l=s1.indexOf(s2);
                    if(l==-1)
                        System.out.println("Substring not found");
                    else 
                    {
                        System.out.println("Substring found");
                        k=true;
                    }
                    break;
                case 4:
                    s="Hello";
                    s1=s1.replaceAll(s2, s);
                    System.out.println(s1);
                case 5:
                    System.exit(0);
            }
        }while(true);
    }
}
