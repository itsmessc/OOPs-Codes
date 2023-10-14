package lab10;
import java.util.*;


public class arrayoversize {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i=0;
        do{
            try{
                a[i++]=sc.nextInt();
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of bounds");
                break;
            }
        }while(true);
        System.out.println("Elements in array:");
        for(int j:a)
        {
            System.out.println(j);
        }
    }    
}
