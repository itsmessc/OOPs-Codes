import java.util.Scanner;

class Student_Detail {
    String name;
    int id;
    String cname;
    Student_Detail(){

    }

    Student_Detail(String n,int i,String c)
    {
        name=n;
        id=i;
        cname=c;
    }

    void display() {
        System.out.println("Name:"+name+" id:"+id+" College name:"+cname);
    }
}

class lab71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t,a;
        int i,e;
        Student_Detail members[]=new Student_Detail[6];
        for(i=0;i<2;i++)
        {
            if(i>0)
                sc.nextLine();
            t=sc.nextLine();
            e=sc.nextInt();
            a=sc.nextLine();
            members[i]=new Student_Detail(t,e,a);
        }
        for(i=0;i<2;i++)
        {
            members[i].display();
        }
    }
}