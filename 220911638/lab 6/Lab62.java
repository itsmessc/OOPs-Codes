import java.util.Scanner;
class Student{
    int regno,age;
    String name;
    
}
class UG extends Student{
    double fees;
    int  semester;
    UG (String n,int r, int a,int s,double f)
    {
        regno=r;
        name=n;
        age=a;
        semester =s;
        fees =f;
    }
    void display()
    {
        System.out.println("Name:"+name+" Regno:"+regno+" age:"+age+" Sem:"+semester+" Fees:"+fees);
    }
}
class PG extends Student{
    double fees;
    int  semester;
    PG (String n,int r, int a,int s,double f)
    {
        regno=r;
        name=n;
        age=a;
        semester =s;
        fees =f;
    }
    void display()
    {
        System.out.println("Name:"+name+" Regno:"+regno+" age:"+age+" Sem:"+semester+" Fees:"+fees);
    }
}
public class Lab62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        UG u[]=new UG[10];
        PG p[]=new PG[10];
        int a=0,b=0,n;
        char ch='y';
        do{
            System.out.println("add student\n1.PG\n2.UG\nTo show all\n3.PG\n4.UG");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter name,regno,age,semester,fees of PG student:");
                    sc.nextLine();
                    p[a++]=new PG(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter name,regno,age,semester,fees of UG student:");
                    sc.nextLine();
                    u[b++]=new UG(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Total PG students:"+a);
                    System.out.println("They are");
                    for(int i=0;i<a;i++)
                    {
                        p[i].display();
                    }
                    break;
                case 4:
                    System.out.println("Total UG students:"+b);
                    System.out.println("They are");
                    for(int i=0;i<b;i++)
                    {
                        u[i].display();
                    }
                    break;
            }
            System.out.println("(y/n)");
            ch=sc.next().charAt(0);

        }while(ch=='y');
    }
}
