// Extend Thread class to create a thread
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().threadId() + " - Count: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Implement Runnable interface to create a thread
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().threadId() + " - Count: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        // Create threads by extending Thread class
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Create threads by implementing Runnable interface
        Thread runnableThread1 = new Thread(new MyRunnable());
        Thread runnableThread2 = new Thread(new MyRunnable());

        // Start the threads
        thread1.start();
        thread2.start();
        runnableThread1.start();
        runnableThread2.start();

        // Using anonymous inner class to create a thread
        Thread anonymousThread = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread " + Thread.currentThread().threadId() + " - Count: " + i);
                    try {
                        Thread.sleep(2000); // Sleep for 2 seconds
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        });
        anonymousThread.start();
    }
}