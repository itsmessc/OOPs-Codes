import java.util.Scanner;
class intarr{
    int arr[]=new int[10];
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("The elements of array are");
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void largest()
    {
        int max=arr[0];
        for(int i=0;i<10;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The largest element is "+max);
    }
    void avg()
    {
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The average of elements is "+(sum/10));
    }
    void sort()
    {
        int temp;
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is");
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class Add2 {
    public static void main(String[] args) {
        intarr b=new intarr();
        b.getdata();
        b.display();
        b.largest();
        b.avg();
        b.sort();
    }
}
