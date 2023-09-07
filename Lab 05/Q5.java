/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.lang.Math;
class Number{
    private double num;
    Number(double num){
        this.num=num;
    }
    boolean isZero( ){
        return num==0;
    }
    boolean isPositive(){
        return num>0;
    } 
    boolean isNegative( ){
        return num<0;
    } 
    boolean isOdd( ){
        return num%2==0;
    } 
    boolean isEven( ){
        return num%2==1;
    } 
    boolean isPrime(){
        if (num<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    } 
    boolean isArmstrong(){
        double val=num,ans=0;
        if (num==0 || num==1)
        {
            return true;
        }
        while(val!=0){
            ans+=Math.pow((val%10), 3);
            val=(int)val/10;
        }
        //System.out.println(ans+val);
        return num==ans;
        
    }
}
public class Q5 {
    public static void main(String args[]){
        Number n = new Number(17);
        System.out.println("Armstrong "+n.isArmstrong());
        System.out.println("Prime "+n.isPrime());
    }
}
