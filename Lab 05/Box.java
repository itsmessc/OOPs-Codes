/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class ABox{
    float h,w,b;
    ABox(int h,int w,int b){
        this.h=h;this.w=w;this.b=b;
    }
    float volume(){
        return h*w*b;
    }
}
public class Box {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter box dimensions");
        int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
        ABox box = new ABox(a,b,c);
        System.out.println("Volume = "+box.volume());

    }
    
}
