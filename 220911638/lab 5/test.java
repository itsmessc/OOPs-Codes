class Box{
    double width;
    double height;
    double depth;
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}

public class test {
    public static void main(String[] args) {
        Box A=new Box(2,4,5);
        double y=A.volume();
        System.out.println(y);
    }
}
