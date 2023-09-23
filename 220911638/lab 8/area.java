import java.lang.Math;

abstract class areaa{
    abstract double area();
    abstract double perimeter();
    abstract void display();
}

class Rect extends areaa{
    double height,width;
    Rect()
    {

    }
    Rect(double h,double w)
    {
        height=h;
        width=w;
    }
    double area()
    {
        return height*width;
    }
    double perimeter()
    {
        return 2*(height + width);
    }
    void display()
    {
        System.out.println("Area:"+area()+" Perimeter:"+perimeter());
    }
}
class circle extends areaa{
    double r;
    circle(){}
    circle(double rA)
    {
        r=rA;
    }
    double area()
    {
        return Math.PI*r*r;
    }
    double perimeter()
    {
        return 2*Math.PI*r;
    }
    void display()
    {
        System.out.println("Area:"+area()+" Perimeter:"+perimeter());
    }
}
public class area {
    public static void main(String[] args) {
        Rect rect=new Rect(20,30);
        rect.display();
        circle c=new circle(10);
        c.display();
    }
}
