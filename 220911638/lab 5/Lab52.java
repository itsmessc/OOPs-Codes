import java.util.Scanner;
class Employee{
    String name;
    String city;
    int salary;
    double da;
    double hra;
    double total;
    void getdata(String n,String c,int s,double d,double h)
    {
        name=n;
        city=c;
        salary=s;
        da=d;
        hra=h;
    }
    void calculate()
    {
        total = salary+salary*da/100.0+salary*hra/100;
    }
    void display(){
        System.out.println("Name:"+name+" City:"+city+" Total Salary:"+total);
    }
}

public class Lab52 {
    public static void main(String[] args) {
        Employee emp =new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name City BasicSalary DA HRA");
        emp.getdata(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
        emp.calculate();
        emp.display();
        
    }
}
