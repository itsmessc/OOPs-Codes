/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.lang.Math;
interface Areaa{
    double area();
    double perimeter();
    void display();
}
class Rectanglea implements Areaa
{
    double height,width;
    
    Rectanglea()
    {
        height=0;width=0;
    }
    Rectanglea(double a,double b)
    {
        height=a;width=b;
    }
    
    @Override
    public double area()
    {
        return height*width;
    }
    @Override
    public double perimeter()
    {
        return 2*(height+width);
    }
    @Override
    public void display()
    {
        System.out.println("Area: "+this.area()+"\nPerimeter "+this.perimeter());
    }
}
class Circlea implements Areaa
{
    double radius;
    
    Circlea()
    {
        radius=0;
    }
    Circlea(double r)
    {
        radius=r;
    }
    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public void display()
    {
        System.out.println("Area: "+this.area()+"\nCircumference "+this.perimeter());
    }
}
public class Q3 {
    public static void main(String args[])
    {
        Areaa obj=new Rectanglea(20,30);
        obj.display();
        obj=new Circlea(10);
        obj.display();
    }
}

