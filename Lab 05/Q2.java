/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class Employee{
    String name,city;
    float basic, da, hra;
    Scanner scanner = new Scanner(System.in);
    void getdata(){
        System.out.println("Enter employee name, city, basic salary, \n" +
"dearness allowance (DA%) and house rent (HRA%)");
        name = scanner.nextLine();
        city = scanner.nextLine();
        basic = scanner.nextInt();
        da = scanner.nextInt();
        hra = scanner.nextInt();
        
}
    void display(){
        System.out.println("\nName "+name+"\nCity "+city+"\nBasic salary "+basic+"\nTotal salary "+ this.calculate());
    }
    float calculate(){
        
        return  basic+basic*da/100+basic*hra/100;
    }
}
public class Q2 {
    public static void main(String args[]){
        Employee e=new Employee();
        e.getdata();
        e.display();
    }
}
