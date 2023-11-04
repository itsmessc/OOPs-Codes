package lab12;
import java.util.*;
class Genericstack<T>{
    ArrayList<T> stack=new ArrayList<>();
    void push(T item)
    {
        stack.add(item);
    }
    T pop()
    {
        return  stack.remove(stack.size()-1);
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
}
class Student{
    String name;
    int rollno;
    Student(String name,int r)
    {
        this.name=name;
        rollno=r;

    }
}
class Employee{
    String name;
    int id;
    Employee(String name,int r)
    {
        this.name=name;
        id=r;

    }
}
class Q2{
    public static void main(String[] args) {
        Genericstack<Student> s=new Genericstack<>();
        Genericstack<Employee> e=new Genericstack<>();
        e.push(new Employee("Amar", 05));
        e.push(new Employee("Akbar", 30));
        s.push(new Student("vicky", 12));
        while(!s.isEmpty())
        {
            Student m=s.pop();
            System.out.println("Student name:"+m.name+" rollno:"+m.rollno);
        }
        while(!e.isEmpty())
        {
            Employee o=e.pop();
            System.out.println("EMployee name:"+o.name+" id:"+o.id);
        }
        
    }
}