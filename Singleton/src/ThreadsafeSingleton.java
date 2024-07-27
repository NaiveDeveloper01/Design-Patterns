import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadsafeSingleton {

    private static ThreadsafeSingleton instance;
    private static Lock lock = new ReentrantLock();

    private ThreadsafeSingleton() {
    }

    public static  ThreadsafeSingleton getInstance() {
        if (instance == null) {
            try {
                lock.lock();
                if (instance == null)
                    instance = new ThreadsafeSingleton();
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }
}
