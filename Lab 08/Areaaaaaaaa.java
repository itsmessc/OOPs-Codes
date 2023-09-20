/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.lang.Math;
abstract class Area{
    abstract double area();
    abstract double perimeter();
    abstract void display();
}
class Rectangle extends Area
{
    double height,width;
    
    Rectangle()
    {
        height=0;width=0;
    }
    Rectangle(double a,double b)
    {
        height=a;width=b;
    }
    
    @Override
    double area()
    {
        return height*width;
    }
    @Override
    double perimeter()
    {
        return 2*(height+width);
    }
    @Override
    void display()
    {
        System.out.println("Area: "+this.area()+"\nPerimeter "+this.perimeter());
    }
}
class Circle extends Area
{
    double radius;
    
    Circle()
    {
        radius=0;
    }
    Circle(double r)
    {
        radius=r;
    }
    @Override
    double area()
    {
        return Math.PI*radius*radius;
    }
    @Override
    double perimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    void display()
    {
        System.out.println("Area: "+this.area()+"\nCircumference "+this.perimeter());
    }
}
public class Areaaaaaaaa {
    public static void main(String args[])
    {
        Area obj=new Rectangle(20,30);
        obj.display();
        obj=new Circle(10);
        obj.display();
    }
}
