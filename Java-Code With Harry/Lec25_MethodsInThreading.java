class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread execution completed.");
    }
}


/*
**********************************************************************************************************************
Threads Methods with details :

    start(): Begins the execution of a thread by invoking its run() method.

    join(): Waits for a thread to terminate its execution before proceeding with the execution of the calling thread.

    isAlive(): Checks whether a thread is currently executing or has terminated.

    interrupt(): Interrupts the execution of a thread by causing it to throw an InterruptedException.

    sleep(long millis): Causes the currently executing thread to sleep (temporarily pause) for the specified
    * number of milliseconds.

    getName(): Returns the name of the thread.

    setName(String name): Sets the name of the thread.

    getPriority(): Returns the priority of the thread.

    setPriority(int priority): Sets the priority of the thread.

    isDaemon(): Checks whether the thread is a daemon thread.

    setDaemon(boolean on): Marks the thread as either a daemon thread or a user thread.
**********************************************************************************************************************

 */


public class Lec25_MethodsInThreading {
    public static void main(String[] args) throws InterruptedException {
        // Creating and starting a thread
        MyThread thread = new MyThread();
        thread.start();

        // Joining a thread
        thread.join(); // Wait for the thread to complete

        // Checking if a thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is still running.");
        } else {
            System.out.println("Thread has completed execution.");
        }

        // Interrupting a thread
        thread.interrupt();

        // Sleeping in the main thread
        System.out.println("Main thread is sleeping for 1 second.");
        Thread.sleep(1000); // Sleep for 1 second

        // Getting and setting thread name
        System.out.println("Thread name: " + thread.getName());
        thread.setName("MyThread");
        System.out.println("Thread name after setting: " + thread.getName());

        // Getting thread priority
        System.out.println("Thread priority: " + thread.getPriority());

        // Setting thread priority
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread priority after setting: " + thread.getPriority());

        // Checking if a thread is daemon
        System.out.println("Is thread daemon? " + thread.isDaemon());
    }
}
