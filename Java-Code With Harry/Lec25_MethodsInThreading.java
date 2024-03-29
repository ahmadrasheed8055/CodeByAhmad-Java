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
