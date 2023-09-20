/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab08;
import java.util.Calendar;
interface market
{
    //int count=0;
    void sales();
}
class Software implements market{
    static int count;
    String OS,type;
    Software(){
        count++;
    }
    Software(String a,String b){
        OS=a;type=b;
        count++;
    }
    @Override
    public void sales()
    {
        System.out.println("Number of items sold "+count);
    }
}
class Hardware implements market{
    static int count;
    String OG,category;
    Hardware(){
        count++;
    }
    Hardware(String a,String b){
        OG=a;category=b;
        count++;
    }
    @Override
    public void sales()
    {
        System.out.println("Number of items sold "+count);
    }
}
public class Lab08 {

    public static void main(String[] args) {
        
        Software s=new Software("aaa","bbb");
        
        Hardware h=new Hardware("ccc","ddd");
        s.sales();
        h.sales();
    }
}
