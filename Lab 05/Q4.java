/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Complex{
    int real,ima;
    Complex(int r,int i){
        real=r;ima=i;
    }
    void add(int a)
    {
        System.out.println("Sum = "+(real+a)+" + "+ima+"i");
    }
    void add(Complex a)
    {
        System.out.println("Sum = "+(real+a.real)+" + "+(a.ima+ima)+"i");
    }
    
}
public class Q4 {
    
    public static void main(String args[]){
        Complex a = new Complex(2,3), b= new Complex(2,-3);
        a.add(5);
        a.add(b);
        
    }
    
}
