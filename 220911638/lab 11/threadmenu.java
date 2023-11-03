import java.util.Scanner;

class RunnableDemo implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface.");
    }
}

class ThreadDemo2 extends Thread {
    public void run() {
        System.out.println("Thread created by inheriting Thread class.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Create thread using Runnable interface");
            System.out.println("2. Create thread by inheriting Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    RunnableDemo runnableDemo = new RunnableDemo();
                    Thread thread1 = new Thread(runnableDemo);
                    thread1.start();
                    Thread.sleep(100);
                    break;
                case 2:
                    ThreadDemo2 threadDemo2 = new ThreadDemo2();
                    threadDemo2.start();
                    Thread.sleep(100);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }
}

