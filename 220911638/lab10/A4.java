import java.util.Scanner;
class Student {
    int marks[];
    int nos;
    Student(){};
    Student(int n)
    {
        nos=n;
        marks=new int[nos];
    }
    void getmark (int m,int i) throws MarkOutofBoundsException
    {
        if(m>100)
        {
            throw new MarkOutofBoundsException("Marks can't be more than 100");
        }
        marks[i]=m;
    }
}
class MarkOutofBoundsException extends Exception{
    MarkOutofBoundsException(String s) {
        super(s);
    }
}
public class A4 {
    public static void main(String[] args) throws MarkOutofBoundsException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int n=sc.nextInt();
        Student s=new Student(n);
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter marks:");
            s.getmark(sc.nextInt(), i);
        }
    }
}
