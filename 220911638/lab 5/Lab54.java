class Complex{
    double in;
    double imaginary;
    Complex(double i,int l)
    {
        in=i;
        imaginary=l;
    }
    void add(int i,Complex op)
    {
        in=i+op.in;
        imaginary=op.imaginary;
        System.out.println(in+"+"+imaginary+"i");
    }
    void add(Complex op1,Complex op2)
    {
        in=op1.in+op2.in;
        imaginary=op1.imaginary+op2.imaginary;
        System.out.println(in+"+"+imaginary+"i");
    }
}

public class Lab54 {
    public static void main(String[] args) {
        Complex a=new Complex(0,0);
        Complex b=new Complex(1,3);
        Complex c=new Complex(2,3);
        a.add(1,b);
        a.add(b,c);
    }
}
