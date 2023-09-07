/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class Account{
    String name;
    float balance=0;
    Account(){
        
    }
    Account(float balance)
    {
        this.balance=balance;
    }
    int getRate()
    {
       return 10; 
    }
    float intrest()
    {
        return this.balance*this.getRate()/100;
    }
}
class SBI extends Account{
    SBI(){
        
    }
    SBI(float balance)
    {
        super(balance);
    }
    int getRate(){
        return 8;
    }
    
}
class ICIC extends Account{
    ICIC(){
        
    }
    ICIC(float balance)
    {
        super(balance);
    }
    int getRate(){
        return 7;
    }
    
}
class AXIS extends Account{
    AXIS(){
        
    }
    AXIS(float balance)
    {
        super(balance);
    }
    int getRate(){
        return 9;
    }
    
}


    
public class GetIntrest {
    public static void main(String args[]){
        SBI obj1=new SBI(1000);
        ICIC obj2=new ICIC(1000);
        AXIS obj3=new AXIS(1000);
        System.out.println("SBI "+obj1.intrest());
        System.out.println("ICIC "+obj2.intrest());
        System.out.println("Axis "+obj3.intrest());
    }
}
