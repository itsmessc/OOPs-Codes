//import java.util.ArrayList;
import java.util.Scanner;
class Book{
    String title;
    String author;
    int edi;
    Book()
    {
        title="noname";
        author="noname";
        edi=0;
    }
    Book(String t,String a,int e)
    {
        title=t;
        author=a;
        edi=e;
    }
    void display()
    {
        System.out.println(title+" "+author+" "+edi);
    }
    
}
public class Lab56{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t,a;
        int i,e;
        //a="noname";
        //System.out.println(a);
        Book[] b =new Book[6];
        Book m=new Book();
        //ArrayList<Book> b=new ArrayList<Book>();
        /*b[0]=new Book(sc.nextLine(),sc.nextLine(),sc.nextInt());
        
        b[0].display();
        b[1]=new Book(sc.nextLine(),sc.nextLine(),sc.nextInt());*/
        for(i=0;i<6;i++)
        {
            //b[i]=new Book();
            System.out.println("Enter Title,author name, edition");
            if(i>0)
                sc.nextLine();
            t=sc.nextLine();
            a=sc.nextLine();
            e=sc.nextInt();
            b[i]=new Book(t,a,e);
            //System.out.println(t+a+e);
        }
        for(i=0;i<6;i++)
        {
            for(int j=0;j<5;j++)
            {
                if((b[j].title).compareTo((b[j+1].title))>0);
                m=b[j];
                b[j]=b[j+1];
                b[j+1]=m;
            }
        }
        
        b[0].display();
        b[1].display();
        System.out.println("Enter author name to search");
        sc.nextLine();
        a=sc.nextLine();
        System.out.println(b[0].author);
        for(i=0;i<6;i++)
        {
            if(a.compareTo(b[i].author)==0)
                b[i].display();
        }
        //System.out.println(b[0].title);
    }
}