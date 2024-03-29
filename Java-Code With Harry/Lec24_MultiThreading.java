// Method 1: By extending Thread class
class Thread1 extends Thread {
    public Thread1(String name) {
        //this super means we are giving name to the parent(Thread) class
        super(name);

    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("1st Thread");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("2nd Thread");
        }
    }
}

// Method 2: By implementing Runnable interface
class Thread3 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("4th Thread ");
        }
    }
}

class Thread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("5th Thread");
        }
    }
}


public class Lec24_MultiThreading extends Thread4 {
    public static void main(String[] args) {
        // Creating instances of Thread1 and Thread2 by extending Thread class
        Thread1 thread1 = new Thread1("Constructor 1");
        Thread2 thread2 = new Thread2();

        // Creating instances of Thread3 and Thread4 by implementing Runnable interface
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        Lec24_MultiThreading thread5 = new Lec24_MultiThreading();

        // Creating threads using Runnable objects
        Thread t1 = new Thread(thread3, "Constructor 2");
        Thread t2 = new Thread(thread4);
        Thread t3 = new Thread(thread5);

        // Starting all threads
        thread1.start();
        thread2.start();
        t1.start();
        t2.start();
        t3.start();
        thread5.N();
        thread5.M();

        //Constructors in threading
        //String constructor
        System.out.println(thread1.getName());
        System.out.println(t1.getName());

        //you can set priority
        t1.setPriority(Thread.MAX_PRIORITY);


    }

    public void N() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Ahmad");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Rasheed");
        }
    }

    public void M() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Sno0p");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Dog");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("6th thread");
        }
    }
}
