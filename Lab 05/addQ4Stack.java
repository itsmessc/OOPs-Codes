/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Stack{
    
    int max=20,top=-1,stack[]=new int[max];
    void push(int item){
        if(top==max-1){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top]=item;
        System.out.println(stack[top]+" added");
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stack[top]+" removed");
        top--;
    }
    void display(){
        System.out.print("Stack: ");
        for(int i=0;i<top+1;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    
}
public class addQ4Stack {
    public static void main(String args[]){
        Stack stk = new Stack();
        stk.pop();
        stk.display();
        stk.push(10);
        stk.display();
        stk.push(20);
        stk.display();
        stk.pop();
        stk.display();
        stk.pop();
        stk.push(30);
        stk.display();
        stk.pop();
        stk.display();
        
    }
}
