package thread.threadpool;

import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(5);
        Executors.newScheduledThreadPool(10);
        Executors.newSingleThreadExecutor();

        BlockingQueue queue = new ArrayBlockingQueue(10);
        ThreadFactory factory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        };
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 10, 20l, TimeUnit.SECONDS, queue, factory, handler);
    }


}
