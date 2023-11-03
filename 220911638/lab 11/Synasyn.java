class MyClass {
    private int sharedResource;

    public synchronized void synchronizedMethod() {
        for (int i = 0; i < 5; i++) {
            sharedResource++;
            System.out.println(Thread.currentThread().getName() + " incremented shared resource to " + sharedResource);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void synchronizedStatement() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                sharedResource--;
                System.out.println(Thread.currentThread().getName() + " decremented shared resource to " + sharedResource);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Synasyn {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Thread t1 = new Thread(() -> obj.synchronizedMethod());
        Thread t2 = new Thread(() -> obj.synchronizedMethod());
        Thread t3 = new Thread(() -> obj.synchronizedStatement());
        Thread t4 = new Thread(() -> obj.synchronizedStatement());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}