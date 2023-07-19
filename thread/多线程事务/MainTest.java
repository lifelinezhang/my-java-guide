package thread.多线程事务;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTest {

    public static volatile Boolean CAN_COMMIT = Boolean.TRUE;


    public static void main(String[] args) {
        CountDownLatch mainLatch = new CountDownLatch(1);
        int threadNum = 3;
        CountDownLatch childLatch = new CountDownLatch(threadNum);
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Boolean> childResponse = new ArrayList<Boolean>();

        for (int i = 0; i < threadNum; i++) {
            executorService.execute(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "开始执行");
                    childResponse.add(Boolean.TRUE);
                    childLatch.countDown();
                    mainLatch.await();
                } catch (Exception e) {
                    childResponse.add(Boolean.FALSE);
                    childLatch.countDown();
                    System.out.println(Thread.currentThread().getName() + "出现异常");
                }
            });
        }
        try {
            childLatch.await();
            for (int i = 0; i < childResponse.size(); i++) {
                if (!childResponse.get(i)) {
                    System.out.println("有子线程出现异常");
                    CAN_COMMIT = Boolean.FALSE;
                    break;
                }
            }
            mainLatch.countDown();
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
