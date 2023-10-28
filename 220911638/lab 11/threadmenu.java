import java.util.*;


class Runn implements Runnable{
    public void run(){
        System.out.println("Thread started using Runnable");
    }
}

class Thr extends Thread{
    public void run(){
        System.out.println("Thread running using Threads");
    }
}

class threadmenu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        do{
            System.out.println("1.Runnable\n2.Thread\n3.exit");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    Runn r=new Runn();
                    Thread t=new Thread(r);
                    t.start();
                    break;
                case 2:
                    Thr t2=new Thr();
                    t2.start();
                    break;
                case 3:
                    System.exit(0);
            }
        }while(true);
    }
}