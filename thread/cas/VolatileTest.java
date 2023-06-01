package thread.cas;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {

    public static volatile AtomicInteger race = new AtomicInteger(0);

    private static final int THREAD_COUNT = 20;

    private static CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT);


    private static void increase() {
        race.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
                countDownLatch.countDown();
            }).start();
        }

        countDownLatch.await();
        System.out.println(race);

    }


}
