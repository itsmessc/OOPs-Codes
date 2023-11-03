import java.util.Scanner;

class swapi<T>{
    void swap(T[] array,int i1,int i2){
        T temp=array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }
}
class swaping{
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,7};
        System.out.println("Before swap");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        swapi<Integer> s=new swapi<Integer>();
        s.swap(a,2,3);
        System.out.println("After swap");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}