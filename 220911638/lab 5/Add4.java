class Stack{
    int stack[]=new int[10];
    int top=-1;
    void push(int item)
    {
        if(top==9)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            top++;
            stack[top]=item;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("The popped element is "+stack[top]);
            top--;
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("The elements of stack are");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }
    }
}
public class Add4 {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}
