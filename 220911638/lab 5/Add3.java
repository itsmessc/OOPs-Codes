public class Add3 {
    static void swap (int[] a)
    {
        int temp;
        temp=a[0];
        a[0]=a[1];
        a[1]=temp;
    }
    public static void main(String[] args) {
        int a=3,b=4,temp;
        temp=a;  //Swap by value
        a=b;
        b=temp;
        int c[]={1,2};
        System.out.println("a="+a+" b="+b);
        swap(c); //Swap by reference
        System.out.println("a="+c[0]+" b="+c[1]);
    }
}
