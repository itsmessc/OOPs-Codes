import java.lang.Math;

interface areaa{
    abstract double area();
    abstract double perimeter();
    abstract void display();
}

class Rect implements areaa{
    double height,width;
    Rect()
    {

    }
    Rect(double h,double w)
    {
        height=h;
        width=w;
    }
    public double area()
    {
        return height*width;
    }
    public double perimeter()
    {
        return 2*(height + width);
    }
    public void display()
    {
        System.out.println("Area:"+area()+" Perimeter:"+perimeter());
    }
}
class circle implements areaa{
    double r;
    circle(){}
    circle(double rA)
    {
        r=rA;
    }
    public double area()
    {
        return Math.PI*r*r;
    }
    public double perimeter()
    {
        return 2*Math.PI*r;
    }
    public void display()
    {
        System.out.println("Area:"+area()+" Perimeter:"+perimeter());
    }
}
public class areaaaa {
    public static void main(String[] args) {
        Rect rect=new Rect(20,30);
        rect.display();
        circle c=new circle(10);
        c.display();
    }
}
