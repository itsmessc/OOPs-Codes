package lab12;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList<T>{
    Node<T> head;
    LinkedList()
    {
        this.head=null;
    }
    void add(T data)
    {
        Node<T> newnode=new Node<>(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node<T> curreNode=head;
            while(curreNode.next!=null)
            {
                curreNode=curreNode.next;
            }
            curreNode.next=newnode;
        }
    }
    void display(){
        Node<T> cure=head;
        while(cure!=null)
        {
            System.out.print(cure.data+" ");
            cure=cure.next;
        }
        System.out.println();
    }
}
public class Q3 {
    public static void main(String[] args) {
        LinkedList<Integer> i=new LinkedList<>();
        LinkedList<Double> d=new LinkedList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.display();
        d.add(1.1);
        d.add(2.1);
        d.add(3.1);
        d.display();
    }
}
