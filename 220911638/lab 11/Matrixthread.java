import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Matrixthread {
    private int m[][];
    private int row,column;
    public Matrixthread(int r,int c){
        Scanner sc=new Scanner(System.in);
        row=r;
        column=c;
        m=new int[r][c];
        System.out.println("Enter elements of matrix");
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
    }
    public void display()
    {
        System.out.println("Matrix is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void transpose()
    {
        System.out.println("Transpose is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
    public void maxinmat()
    {
        int max=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(max<m[i][j]);
                max=m[i][j];
            }
        }
        System.out.println("Maximum="+max);
    }
    public void princ()
    {
        System.out.println("Principle diagonal elements:");
        for(int i=0;i<row;i++)
        {
            System.out.print(m[i][i]+" ");
        }
        System.out.println();
    }
    public void nprinc()
    {
        System.out.println("NON Principle diagonal elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(i!=j)

                System.out.print(m[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) throws InterruptedException
    {
        Matrixthread l=new Matrixthread(3, 3);
        Thread t1=new Thread(()->l.display());
        Thread t2=new Thread(()->l.transpose());
        Thread t3=new Thread(()->l.maxinmat());
        Thread t4=new Thread(()->l.princ());
        Thread t5=new Thread(()->l.nprinc());
        if (t1.isAlive()) {
            System.out.println("Thread 1 is still running");
        }
        else
            System.out.println("Thread 1 is dead");
       

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished");

    }
}
