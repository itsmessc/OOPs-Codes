/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Time{
    int h,m,s;
    Time(){
        h=m=s=0;
    }
    Time(int h,int m, int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    Time add(Time b){
        Time sum = new Time();
        sum.s=(s+b.s)%60;
        sum.m = (m+b.m+(s+b.s)/60)%60;
        sum.h=h+b.h + (m+b.m)/60;
        return sum;
    }
    void display(){
        System.out.println("Time "+h+":"+m+":"+s);
    }
}
public class Q3 {
    public static void main(String args[]){
        Time obj1= new Time(5,30,20), obj2 = new Time(4,40,50);
        obj1.add(obj2).display();
    }
}
