import java.util.Scanner;
class Student{
    String Fname,Lname,Deg;
    int regno;
    Student()
    {}
    Student(int r,String Fn,String Ln,String D)
    {
        regno=r;
        Fname=Fn;
        Lname=Ln;
        Deg=D;
    }
    void display()
    {
        System.out.println("Regno:"+regno+" Name:"+Fname+" "+Lname+" Degree:"+Deg);
    }
}
public class strstudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        Student s[]=new Student[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter details of student "+(i+1));
            n=sc.nextInt();
            sc.nextLine();
            s[i]=new Student(n,sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        String name;
        System.out.println("Enter name to search");
        name=sc.nextLine();
        for(int i=0;i<10;i++)
        {
            if((name.compareTo(s[i].Fname))==0 || (name.compareTo(s[i].Lname))==0)
            {
                s[i].display();
            }
        }
    }
}
