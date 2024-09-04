// Write Java make a program to solve concurrency problem using thread.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(new Worker(lock));
        Thread t2 = new Thread(new Worker(lock));
        t1.start();
        t2.start();
    }
}

class Worker implements Runnable {
    private Lock lock;

    public Worker(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } finally {
            lock.unlock();
        }
    }
}