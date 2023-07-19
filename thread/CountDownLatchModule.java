package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * countdownlatch测试
 */
public class CountDownLatchModule {

    private static int N = 10;

    private static int countDownLatchTimeout = 5;

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(N);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < N; i++) {
            executorService.execute(() -> {
                try {
                    String name = Thread.currentThread().getName();
                    System.out.println(name);
                } catch (Exception e) {

                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        System.out.println("main thread do something - 1");
        try {
            countDownLatch.await(countDownLatchTimeout, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("main thread do something - 2");
        }
        executorService.shutdown();
    }

}
